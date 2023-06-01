/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package Ejercicio_2;

package Ejercicio_2;

public class Inmuebles {
    protected int identificadorInmobiliario;
    protected int areaMetrosCuadrados;
    protected String direccion;
    protected double valorCompra;

    Inmuebles(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        this.direccion = direccion;
        //this.valorCompra = calcularValorCompra();
    }

    double calcularValorCompra(double ValorMetroCuadrado) {
        valorCompra = areaMetrosCuadrados * ValorMetroCuadrado;
        return valorCompra;
        //return areaMetrosCuadrados * getValorMetroCuadrado();
    }

    public void imprimir() {
        System.out.println("Identificador Inmobiliario: " + identificadorInmobiliario);
        System.out.println("Área en metros cuadrados: " + areaMetrosCuadrados);
        System.out.println("Dirección: " + direccion);
        System.out.println("Valor de Compra: " + valorCompra);
    }
}


class InmuebleVivienda extends Inmuebles {
    protected int numHabitaciones;
    protected int numBanos;

    public InmuebleVivienda(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de Habitaciones: " + numHabitaciones);
        System.out.println("Número de Baños: " + numBanos);
    }
}

class Casa extends InmuebleVivienda {
    protected int numPisos;

    public Casa(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos, int numPisos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanos);
        this.numPisos = numPisos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de Pisos: " + numPisos);
    }
}


class Apartamento extends InmuebleVivienda {
    //protected boolean esApartaestudio;

    public Apartamento(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanos);
        //this.esApartaestudio = esApartaestudio;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        //System.out.println("Es Apartaestudio: " + esApartaestudio);
    }
}

class casa_rural extends Casa {
    
    protected static double ValorMetroCuadrado = 1500000;
    protected int distanciaCabera;
    protected int altitud;
    
    public casa_rural(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos, int numPisos, int distanciaCabera, int altitud) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanos, numPisos);
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Distancia la cabecera municipal = " + numHabitaciones + "km.");
        System.out.println("Altitud: " + altitud);
    }
}

class casa_urbana extends Casa {
    
    public casa_urbana(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos, int numPisos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanos, numPisos);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
}

class apartamento_familiar extends Apartamento {
    
    protected static double ValorMetroCuadrado = 2000000;
    protected int administracion;
    
    public apartamento_familiar(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos, int administracion) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanos);
        this.administracion = administracion;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("La administracion vale: " + administracion);
        System.out.println();
    }
}

class apartaestudio extends Apartamento {
    
    protected static double ValorMetroCuadrado = 1500000;
    
    public apartaestudio(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, 1, 1);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println();
    }
}

class casa_concerrado extends casa_urbana {
    
    protected static double ValorMetroCuadrado = 2500000;
    protected int administracion;
    protected boolean piscina;
    protected boolean canchas;
    
    public casa_concerrado(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos,
                           int numPisos, int administracion, boolean piscina, boolean canchas ) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanos, numPisos);
        this.administracion = administracion;
        this.piscina = piscina;
        this.canchas = canchas;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Administracion: $ " + administracion);
        System.out.println("Piscina: " + piscina);
        System.out.println("Canchas: " + canchas);
        System.out.println();
    }
}

class casa_indep extends casa_urbana {
    
    protected static double ValorMetroCuadrado = 3000000;
    
    public casa_indep(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos, int numPisos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanos, numPisos);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println();
    }
}

class local extends Inmuebles {
    protected String tipolocal;
    
    public local(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, String tipolocal) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion);
        this.tipolocal = tipolocal;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local: " + tipolocal);
    }
}

class LocalComercial extends local {
    protected static double ValorMetroCuadrado = 3000000;
    protected String centroComercial;

    public LocalComercial(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, String tipolocal, String centroComercial) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, tipolocal);
        this.centroComercial = centroComercial;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Centro Comercial: " + centroComercial);
        System.out.println();
    }
}

class Oficina extends local {
    protected static double ValorMetroCuadrado = 3500000;
    protected boolean esDelGobierno;

    public Oficina(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, String tipolocal, boolean esDelGobierno) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, tipolocal);
        this.esDelGobierno = esDelGobierno;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Es del Gobierno: " + esDelGobierno);
        System.out.println();
    }
}



