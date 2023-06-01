/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author Miguel Angel
 */
public class Main {
    public static void main(String args[]) {
        apartamento_familiar apto1 = new
            apartamento_familiar(103067,120,"Avenida Santander 45-45",3,2,200000);
        System.out.println("Datos apartamento");
        
        apto1.calcularValorCompra(apto1.ValorMetroCuadrado);
            apto1.imprimir();
        System.out.println("Datos apartamento");
        
        apartaestudio aptestudio1 = new
            apartaestudio(12354,50,"Avenida Caracas 30-15",1,1);
        aptestudio1.calcularValorCompra(aptestudio1.ValorMetroCuadrado);
        aptestudio1.imprimir();
}
}

