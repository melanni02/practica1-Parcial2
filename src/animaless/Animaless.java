/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaless;

/**
 *
 * @author Flor Melanni Infante
 */
public abstract class Animaless implements ComparacionAnimal{

    /**
     */
    
        // TODO code application logic here
  protected String color;
  protected String alimento;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
        
}
