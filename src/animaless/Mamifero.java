/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaless;

import static java.lang.reflect.Array.get;

/**
 *
 * @author Flor Melanni Infante
 */
public abstract class Mamifero extends Animaless {
  @Override
  public String getColor() {
        return color;
    }

  @Override
    public void setColor(String color) {
        this.color = color;
    }

  @Override
    public String getAlimento() {
        return alimento;
    }

  @Override
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
   
           
    }
   

