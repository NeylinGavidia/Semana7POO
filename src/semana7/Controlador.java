/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;
import java.util.ArrayList;

/**
 *
 * @author UCC20411
 */
public class Controlador {
    
    ArrayList <Persona> lista = new ArrayList(); 
    public void agregarPersona(Persona p){
    lista.add(p);
    }
    
    public void listarPersona (){
      if (lista.size() == 0)
      {
        System.out.println("No hay personas registradas.");
        } 
      else {
        for (int i = 0; i < lista.size(); i++) 
        {
            System.out.println("El listado de personas es: ");
            System.out.println(lista.get(i));
            System.out.println("******************************");
            //tambien puede ser lista.get(i).verDatos();
            if(lista.get(i) instanceof Obrero){
              Obrero x = (Obrero)lista.get(i);
              x.calcularSueldo(5);
            }
            else if (lista.get(i) instanceof Empleado){
            Empleado z = (Empleado)lista.get(i);
            z.calcularSueldo(14.2);
              }
            }
        }
      }
}
