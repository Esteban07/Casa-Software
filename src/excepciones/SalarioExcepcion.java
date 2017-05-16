/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;  //Paquete. 

/**
 *
 * @author Profe
 */
public class SalarioExcepcion extends Exception{    //Nueva clase, extensión predeterminada. 
    public SalarioExcepcion(){                      //Método.
      super("Salario debe ser mayor al minimo");    //Super, mensaje de la excepción. 
    }
}
