/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;      //Paquete. 

import java.util.ArrayList;

/**
 *
 * @author Profe
 */
public class Lider extends Programador{        //Clase Lider, hereda de programador.
    private ArrayList<Programador> equipo;     //Atributo de clase lider (ArrayList). 
    
    public Lider(int id, String nombre, double salario, String lenguaje) {     //Constructor atributos heredados de Programador.
        super(id, nombre, salario, lenguaje);                //Super con los atributos heredados. 
        this.equipo= new ArrayList<>();                      //Predeterminado con atributo de clase lider. 
    }
    
    public void adicionarProgramador (Programador programador){   //Método clase Lider. 
      this.equipo.add(programador);
    }
   
    @Override                                            //Métodos heredados de la clase programador. 
    public double calcularSalario(){
      double salarioTotal = this.calcularSalario();
      salarioTotal+=(salarioTotal*(this.equipo.size()*0.1));
      return salarioTotal;
    }
    @Override
    public String mostrarInformacion(){
       String informacion = this.mostrarInformacion();
       informacion+=" -- Equipo ---\n";
        for (Programador programador : equipo) {
            informacion += " " + programador.mostrarInformacion();
        }
        return informacion;
    }
}
