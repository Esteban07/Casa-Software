/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones; //PAQUETE NUEVO PARA EXCEPCIONES. 

/**
 *
 * @author Profe
 */                            //CLASE PARA NUEVA EXCEPCIÓN.
public class LenguajeExcepcion extends Exception{    //Nueva clase para excepción con extensión predeterminada. 
    public LenguajeExcepcion(){                      //Método. 
     super("Lenguaje debe ser diferente a GO");      //Súper con mensaje de la excepción. 
    }
}
