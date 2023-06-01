/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;

/**
 *
 * @author Miguel Angel
 */
public class Cuenta {
    
    protected float saldo;
    protected int   numconsignaciones = 0;
    protected int   numretiros = 0;
    protected float tasanual;
    protected float comisionmensual = 0;
    
    public Cuenta(float saldo, float tasanual) {
        this.saldo = saldo;
        this.tasanual = tasanual;
    }
    
    public void consignar(float cantidad) {
        saldo += cantidad;
        numconsignaciones++;
    }    
 
    public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo >= 0) {
            saldo -= cantidad;
            numretiros++; 
        } else {
            System.out.println("No se puede retirar la cantidad especificada. Saldo insuficiente."); 
        }
//        if (cantidad <= saldo) {
//            saldo -= cantidad;
//            numretiros++;
//        } else {
//            System.out.println("No se puede retirar la cantidad especificada. Saldo insuficiente.");
//        }
    }

    public void calcularInteresMensual() {
        float tasaMensual = tasanual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;   
        //float interesMensual = (saldo * tasanual) / 12;
        //saldo += interesMensual;
    }

    public void extractoMensual() {
        saldo -= comisionmensual;
        calcularInteresMensual();
    }    
    
}

class CuentaAhorros extends Cuenta {
    private boolean cuentaActiva;

    public CuentaAhorros(float saldo, float tasanual) {
        super(saldo, tasanual);
        cuentaActiva = (saldo >= 10000);
    }    
    
    public void consignar(float cantidad) {
        if (cuentaActiva) {
            super.consignar(cantidad);
        } else {
            System.out.println("La cuenta de ahorros está inactiva. No se puede consignar dinero.");
        }
    }
    
    public void retirar(float cantidad) {
        if (cuentaActiva) {
            super.retirar(cantidad);
        } else {
            System.out.println("La cuenta de ahorros está inactiva. No se puede retirar dinero.");
        }
    }
    
    public void extractoMensual() {
        if (numretiros > 4) {
            comisionmensual += (numretiros - 4) * 1000;
        }
        super.extractoMensual();
        cuentaActiva = (saldo >= 10000);
    }    
    
    public void imprimir() {
        float saldo_2 = saldo + (saldo * (tasanual / 12));
        System.out.println("Saldo: " + saldo_2);
        System.out.println("Comisión mensual: " + comisionmensual);
        System.out.println("Número de transacciones: " + (numconsignaciones + numretiros));
        System.out.println("Estado de la cuenta: " + (cuentaActiva ? "Activa" : "Inactiva"));
    }        
      
}

class CuentaCorriente extends Cuenta {
    float sobregiro;
    
    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
        sobregiro = 0;
    }

    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            super.retirar(cantidad);
        } else {
            float cantidadSobregiro = cantidad - saldo;
            sobregiro += cantidadSobregiro;
            saldo = 0;
            numretiros++;
        }
    }

    public void consignar(float cantidad) {
        super.consignar(cantidad);
        if (sobregiro > 0) {
            if (cantidad <= sobregiro) {
                sobregiro -= cantidad;
            } else {
                sobregiro = 0;
            }
        }
    }
    
    public void extractoMensual() {
        super.extractoMensual();
    }   

    public void imprimir() {
        //super.imprimir();
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión mensual: " + comisionmensual);
        System.out.println("Número de transacciones: " + (numconsignaciones + numretiros));       
        System.out.println("Sobregiro: " + sobregiro);
    }
}
