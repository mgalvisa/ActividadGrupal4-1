/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Angel
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tipo de cuenta (1 - Ahorros) (2 - Corriente): ");
        float tipocuenta = scanner.nextFloat();        
        
        if (tipocuenta == 1) {
            
            System.out.print("Ingrese el saldo inicial: ");
            float saldoInicial = scanner.nextFloat();
        
            System.out.print("Ingrese la tasa anual: ");
            float tasaAnual = scanner.nextFloat();
        
            CuentaAhorros cuentaAhorros = new CuentaAhorros(saldoInicial, tasaAnual);
        
            System.out.print("Ingrese la cantidad a consignar en la cuenta de ahorros: ");
            float cantidadConsignarAhorros = scanner.nextFloat();
            cuentaAhorros.consignar(cantidadConsignarAhorros);
        
            System.out.print("Ingrese la cantidad a retirar de la cuenta de ahorros: ");
            float cantidadRetirarAhorros = scanner.nextFloat();
            cuentaAhorros.retirar(cantidadRetirarAhorros);        
        
            System.out.println("\n--- Cuenta de Ahorros ---");
            cuentaAhorros.imprimir();            
            
        } else if (tipocuenta == 2){
            
            System.out.print("Ingrese el saldo inicial: ");
            float saldoInicial = scanner.nextFloat();            
            
            System.out.print("Ingrese la tasa anual: ");
            float tasaAnual = scanner.nextFloat();
            
            CuentaCorriente cuentaCorriente = new CuentaCorriente(saldoInicial, tasaAnual);

            System.out.print("Ingrese la cantidad a consignar en la cuenta corriente: ");
            float cantidadConsignarCorriente = scanner.nextFloat();
            cuentaCorriente.consignar(cantidadConsignarCorriente);

            System.out.print("Ingrese la cantidad a retirar de la cuenta corriente: ");
            float cantidadRetirarCorriente = scanner.nextFloat();
            cuentaCorriente.retirar(cantidadRetirarCorriente);    

            System.out.println("\n--- Cuenta Corriente ---");
            cuentaCorriente.imprimir();
            
        } else{
            System.out.print("Numero incorrecto");
        }
         
        scanner.close();
    }
}

