/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;           //Paquete. 

/**
 *
 * @author Profe
 */
public class Programador extends Empleado{   //Clase programador, hereda de Empleado.
    protected String lenguaje;               //Atributo clase programador. 

    public Programador(int id, String nombre, double salario,String lenguaje) {  //Constructor atributos de Empleado y atrubuto de programador.
        super(id, nombre, salario);   //Predeterminado con atributos de la herencia.                  
        this.lenguaje = lenguaje;     //Atributo de lenguaje. 
    }
    
                                
    @Override                           //Métodos heredados de empleado, empleado no los uso porque es una clase abstracta. 
    public double calcularSalario() {       
        double bonificacion = 0;
        if(this.lenguaje.equals("java"))
            bonificacion = this.salario *0.2;
        return this.salario + bonificacion;
    }

    @Override
    public String mostrarInformacion() {
       return "Programador " + this.nombre + " " + this.lenguaje;
    }
    
    
}
