/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exer4animales;

/**
 *
 * @author David R.L
 */
public class Gato extends Felino{
    public String getSonido() {
return "Maullido";
}
/**
* Método que devuelve un String con los alimentos de un gato
* @return Un valor String con la alimentación de un gato: “Ratones”
*/
public String getAlimentos() {
return "Ratones";
}
/**
* Método que devuelve un String con el hábitat de un gato
* @return Un valor String con el hábitat de un gato: “Doméstico”
*/
public String getHábitat() {
return "Doméstico";
}
/**
* Método que devuelve un String con el nombre científico de un gato
* @return Un valor String con el nombre científico de un gato: 
* “Felis silvestris catus”
*/
public String getNombreCientífico() {
return "Felis silvestris catus";
}
}
