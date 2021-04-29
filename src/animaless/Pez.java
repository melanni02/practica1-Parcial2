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
public abstract class Pez extends Oviparo  {
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

    /**
     *
     * @param alimento
     */
    @Override
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}
