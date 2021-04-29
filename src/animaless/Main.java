/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaless;

import static javafx.scene.paint.Color.color;

/**
 *
 * @author Flor Melanni Infante
 */
public class Main {
    public static void main(String[]args){
        Animaless animal = new Animaless();//se crea un objeto o creacion de instancia de la clase animal
        System.out.println(animal.getcolor());
        
        Animaless animal2 = new Animaless (color"negro");
        System.out.println(animal2.getcolor());
        
        Mamifero mamifero = new Mamifero();
    }
   }
    
    

