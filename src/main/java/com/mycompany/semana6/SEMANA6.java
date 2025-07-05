/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana6;

/**
 *
 * @author Jerry Vega
 */
public class SEMANA6 {

    public static void main(String[] args) {
        
        // Creando instancias de las clases
        Animal miPerro = new Perro("Rex");
        Animal miGato = new Gato("Miau");

        // Demostrando polimorfismo
        hacerSonidoAnimal(miPerro);
        hacerSonidoAnimal(miGato);
    }

    // Método que demuestra polimorfismo
    public static void hacerSonidoAnimal(Animal animal) {
        animal.hacerSonido();
    }
}
    

