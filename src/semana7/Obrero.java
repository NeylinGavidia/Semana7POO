/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

/**
 *
 * @author UCC20411
 */
public class Obrero extends Persona{
    
    private int jornal;

    public Obrero(int jornal, int edad, String nombre) {
        super(edad, nombre);
        this.jornal = jornal;
    }

}