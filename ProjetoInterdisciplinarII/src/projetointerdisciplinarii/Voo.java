/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointerdisciplinarii;

import java.util.*;

/**
 *
 * @author Azuos & Rosangela
 */
public class Voo {
    private int numero;
    private String origem;
    private String destino;    
    private int numerodeAssentos;
    private ArrayList<Reserva> listaReservas;
    
    public Voo(int numero, String origem, String destino, int numerodeAssentos){
        listaReservas = new ArrayList();
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.numerodeAssentos = numerodeAssentos;
    }
    
    public int ObterNumero (){
        return numero;
    }
    
    public void AlteraNumero(int NovoNumero) {
        this.numero = NovoNumero;
    }
    
    public  String ObterOrigem (){ 
        return origem;
    }
    
    public void AlteraOrigem (String novaOrigem){ 
        this.origem = novaOrigem;
    }
    
    public String ObterDestino (){
        return destino;
    }
            
    public void AlteraDestino (String novoDestino){
        this.destino = novoDestino;
    }
    
    public int ObterNumerodeAcentos(){
        return numerodeAssentos;  
    }
    
    public int ObterNumerodeReservas() {
        return listaReservas.size();
    }
    
    public ArrayList<Reserva> ObterReservas() {
        return listaReservas;
    }    
    
    public String NovaReserva(Reserva reserva){
        if(listaReservas.size() < numerodeAssentos){
            listaReservas.add(reserva);
            
            return "A reserva do(a) Sr(a) "
                    +reserva.ObterNomeUsuario()
                    +" Foi realizada com sucesso!";
            
        }else{
            return "Não existem mais assentos disponíveis nesse Voo!!";
        }        
    }
    
    public boolean equals(Voo voo) {
        if (voo == null) {
            return false;
        }
        
        return voo.numero == this.numero
            || (this.numero > 0 && this.numero == voo.numero);
    }    
}