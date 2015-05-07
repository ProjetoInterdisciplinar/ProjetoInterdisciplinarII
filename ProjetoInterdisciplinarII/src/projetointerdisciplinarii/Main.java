/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointerdisciplinarii;

import java.util.ArrayList;

/**
 *
 * @author TiagoSarri
 */
public class Main {
private static ArrayList <Voo> listaVoos;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        listaVoos = new ArrayList();
        AdicionaVoo(283, "São Paulo","Rio de Janeiro",150);   //teste, dps tenho q retirar isso kkkk[tiago silva]
    }
    
    public static void AdicionaVoo(int numeroVoo, String Origem, String Destino, int numerodeAssentos){
        Voo novoVoo = new Voo(numeroVoo, Origem, Destino, numerodeAssentos);        
        listaVoos.add(novoVoo);        
        System.out.println("Novo Voo foi adicionado com sucesso!");
    }
}