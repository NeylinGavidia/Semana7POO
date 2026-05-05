/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

/**
 *
 * @author UCC20411
 */
public class Persona {
    
    protected String tipodocumento; //protected porque es padre
    protected String nrodocumento;
    protected String nombre;
    protected String apellidop;
    protected String apellidom;

    public Persona(String tipodocumento, String nrodocumento, String nombre, String apellidop, String apellidom) {
        this.tipodocumento = tipodocumento;
        this.nrodocumento = nrodocumento;
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getNrodocumento() {
        return nrodocumento;
    }

    public void setNrodocumento(String nrodocumento) {
        this.nrodocumento = nrodocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }
    
    
    public void verDatos()
    {
        System.out.println("Tipo de documento: "+this.tipodocumento+ "| Nro de documento: "+this.nrodocumento+
                "| Nombre: "+this.nombre+ "| Apellido paterno: "+this.apellidop + "| Apellido materno: "+this.apellidom);
    }

}
