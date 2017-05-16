/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;    //Paquete. 

/**
 *
 * @author Profe
 */
public class Admon extends Empleado{        //Clase Admon, hereda de Empleado. 

    public Admon(int id, String nombre, double salario) {     //Constructor para atributos de Empleado.  
        super(id, nombre, salario);                 //Super con atributos de la clase heredada. 
    }

    @Override                                //Métodos de clase Empleado, ella no los usa porque es abstracta.
    public double calcularSalario() {
        return this.salario;
    }

    @Override
    public String mostrarInformacion() {
        return "Admon "  + this.nombre + " " + this.id;
    }
    
}
