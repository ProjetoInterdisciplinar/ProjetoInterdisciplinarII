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
         if (this.VerificaIndexNumeroVoo(voo.RetornaNumero()) > -1) {
            return "Número do voo já existe.";
         } else {
            listaVoos.add(voo);
            return "Voo adicionado com sucesso.";
         }
     }
     
     public int VerificaIndexNumeroVoo(int numero) {
         int rtn = -1;
         int count = 0;
         
         if (this.listaVoos.size() > 0) {
             for (Voo item : this.listaVoos) {
                 if (item.RetornaNumero() == numero) {
                     rtn = count;
                     break;
                 }
                 count++;
             }
         }         
         
         return rtn;
     }
     
     public Boolean ExisteVooCadastrado()
     {
         return (this.listaVoos.size() > 0)? true : false;
     }
     
     public String CancelarVoo(int numero) {
         String rtn;
         int indexVoo = this.VerificaIndexNumeroVoo(numero);
         
         if (indexVoo > -1)
         {
             listaVoos.remove(indexVoo);
             rtn = "Voo removido com sucesso.";
         } else {
             rtn = "Não existem voo com o número " + numero;
         }
         
         return rtn;
     }     
}
