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
//    private int dias;

    public Obrero(double jornal, /*int dias,*/ String tipodocumento, String nrodocumento, String nombre, String apellidop, String apellidom) {
        super(tipodocumento, nrodocumento, nombre, apellidop, apellidom);
        this.jornal = jornal;
//        this.dias = dias;
    }

    public double getJornal() {
        return jornal;
    }

    public void setJornal(double jornal) {
        this.jornal = jornal;
    }
//    public int getDias() {
//        return dias;
//    }
//
//    public void setDias(int dias) {
//        this.dias = dias;
//    }
    
//    public void calcularSueldo(){
//        double rpta = (this.jornal * this.dias);
//        System.out.println("El sueldo es: " + rpta);
//    }
    
    public void calcularSueldo(int dias){
        double rpta = (this.jornal * dias);
        System.out.println("El sueldo es: " + rpta);
     } 
}