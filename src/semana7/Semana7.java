/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana7;

/**
 *
 * @author UCC20411
 */
public class Semana7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado e1 = new Empleado(324.4, "DNI", "23123456", "Luis", "Gutierrez", "Paredes");
        Obrero o1 = new Obrero(110.3, /*4,solo si se agrega como atributo*/ "DNI", "23123456", "Luis", "Gutierrez", "Paredes");
        //se puede agregar e1.setApellidom para quitar los parametros predeterminados que esta en la linea de arriba
        e1.verDatos();
        o1.verDatos();
        
        Controlador ctrl = new Controlador();
        
        ctrl.agregarPersona(e1);
        ctrl.agregarPersona(o1);
        
        
        ctrl.listarPersona();
    }
}
