/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;        //Paquete.

/**
 *
 * @author Profe
 */
public abstract class Empleado implements Contrato{    //Clase abstracta: Permite que clases hijas hereden sus métodos y/o atributos. 
    protected int id;
    protected String nombre;                            //ATRIBUTOS. 
    protected double salario;

    public Empleado(int id, String nombre, double salario) {      //    CONSTRUCTOR. 
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }                                                       //GET AND SET. 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}                                                          //Es clase abstracta, entonces se hace la loca con los métodos de contrato. 