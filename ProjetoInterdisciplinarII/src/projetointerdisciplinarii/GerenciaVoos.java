/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointerdisciplinarii;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author TiagoSarri
 */
public class GerenciaVoos {
     private ArrayList<Voo> listaVoos;
     
     public GerenciaVoos() {
         listaVoos = new ArrayList();
     }
     
     public String AdicionarVoo(Voo voo) {
         if (VerificaNumeroVoo(voo.RetornaNumero())) {
            return "Número do voo já existe.";
         } else {
            listaVoos.add(voo);
            return "Voo adicionado com sucesso.";
         }
     }
     
     public Boolean VerificaNumeroVoo(int numero) {
         Boolean rtn = false;
         
         if (this.listaVoos.size() > 0) {
             for (Voo item : this.listaVoos) {
                 if (item.RetornaNumero() == numero) {
                     rtn = true;
                     break;
                 }
             }
         }         
         
         return rtn;
     }
     
     public String CancelarVoo(int numero) {
         String rtn = "Nenhum voo cadastrado";
         
         if (this.VerificaNumeroVoo(numero))
         {
             
             
         } else {
             rtn = "Não existem voo com o número " + numero;
         }
         
         return rtn;
     }     
}
