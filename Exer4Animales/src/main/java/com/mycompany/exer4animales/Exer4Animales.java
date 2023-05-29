/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exer4animales;

/**
 *
 * @author David R.L
 */
public class Exer4Animales {

    public static void main(String[] args) {
        Animal[] animales = new Animal[4]; /* Define un array de cuatro 
elementos de tipo Animal */
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
        for (int i = 0; i < animales.length; i++) { /* Recorre el array de 
animales */
            System.out.println(animales[i].getNombreCientífico());
            System.out.println("Sonido: " + animales[i].getSonido());
            System.out.println("Alimentos: " + animales[i].getAlimentos());
            System.out.println("Hábitat: " + animales[i].getHábitat());
            System.out.println();
        }
    }
}
