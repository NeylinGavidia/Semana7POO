/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

/**
 *
 * @author UCC20411
 */
public class Empleado extends Persona {
    
    private double salario;

    public Empleado(double salario, String tipodocumento, String nrodocumento, String nombre, String apellidop, String apellidom) {
        super(tipodocumento, nrodocumento, nombre, apellidop, apellidom);
        this.salario = salario;
    }    

    public Empleado() { //sin este no puede agregar sin getters ni setters. Y esto tambien debe existir en la clase padre
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void verDatos() {
        System.out.println("Salario: "+this.salario+"| Tipo documento: " + this.tipodocumento+"| Nro documento: "+this.nrodocumento+
                "| Nombre: "+this.nombre+ "| Apellido paterno: "+this.apellidop+ "| Apellido materno: "+this.apellidom);
    }
    
    
}
