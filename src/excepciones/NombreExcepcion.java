/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones; //Paquete. 

/**
 *
 * @author Profe
 */
public class NombreExcepcion extends Exception{  //Publicación de la clase, extensión predeterminada.
    public NombreExcepcion(){                    //Método. 
     super("Nombre debe tener 10 Caracteres");   //Super,  Mensaje con la extensión. 
    }
}
