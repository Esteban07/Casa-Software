 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;                    //Paquete. 

import java.util.ArrayList;

/**
 *
 * @author Profe
 */
public class CasaSoftware {                    //Clase CasaSoftware, libre. 
    private ArrayList<Contrato> contratos;     //Creación de ArrayList contrato. 

    public CasaSoftware() {                       //Constructor. 
        this.contratos = new ArrayList<>();       //Para ArrayList de clase CasaSotware.
    }
    
    public void adicionarContrato(Contrato contrato){   //Método dentro de la clase. 
      this.contratos.add(contrato);
    }
                                                     //MÉTODOS DENTRO DE LA CLASE.
    public double calcularSalarioTotal(){
        double salarioTotal = 0;
        for (Contrato contrato : contratos) {
            salarioTotal+=contrato.calcularSalario();
        }
        return salarioTotal;
    }
    
    public String mostrarInformacion(){
      String informacion ="";
        for (Contrato contrato : contratos) {
            informacion+= " " + contrato.mostrarInformacion();
        }
        return informacion;
    }
   
    
    
}
