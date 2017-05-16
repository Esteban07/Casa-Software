/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;             //Paquete. 

/**
 *
 * @author Profe
 */
public class Consultor implements Contrato{   //Clase consultor, implementa métodos de Contrato. 
    protected int id;                         //Atributos de la clase consultor. 
    protected String labor;
    
    @Override                                //Implementación métodos de clase Contreto. 
    public double calcularSalario() {
        return 100;
    }

    @Override
    public String mostrarInformacion() {
        return "Consultor"  + this.id + " " + this.labor;
    }
    
}
