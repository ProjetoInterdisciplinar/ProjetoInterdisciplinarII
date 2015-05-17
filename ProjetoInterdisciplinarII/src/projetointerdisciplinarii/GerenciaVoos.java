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
     
     public String adicionarVoo(Voo voo) {
         listaVoos.add(voo);
         return "Voo adicionado com sucesso.";
     }
}
