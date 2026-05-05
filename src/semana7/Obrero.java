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
    
    private double jornal;

    public Obrero(double jornal, String tipodocumento, String nrodocumento, String nombre, String apellidop, String apellidom) {
        super(tipodocumento, nrodocumento, nombre, apellidop, apellidom);
        this.jornal = jornal;
    }

    public double getJornal() {
        return jornal;
    }

    public void setJornal(double jornal) {
        this.jornal = jornal;
    }
}