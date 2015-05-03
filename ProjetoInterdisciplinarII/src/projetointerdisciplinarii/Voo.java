/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointerdisciplinarii;

import java.util.ArrayList;

/**
 *
 * @author Azuos
 */
public class Voo {

    private int numero;
    private String Origem;
    private String Destino;
    private int NumerodeAssentos;
    private ArrayList <Reserva> listaReservas;
    
   
    
   
    public  Voo(int numeroVoo, String Origem, String Destino, int numerodeAssentos){
        //esse método é executado na criação do objeto Voo
        listaReservas = new ArrayList();
        this.numero = numeroVoo;
        this.Origem = Origem;
        this.Destino = Destino;
        this.NumerodeAssentos = numerodeAssentos;
    }
    public int RetornaNumero (){ //esse método retorna (get)número do voo
        return numero;
    }
    public void AlteraNumero(int NovoNumero) {// esse método altera (set) numero do voo
        this.numero = NovoNumero;
    }
    public  String RetornaOrigem (){ 
        return Origem;
    }
    public void AlteraOrigem ( String NovaOrigem){ 
        this.Origem = NovaOrigem;
    }
    
    public String RetornaDestino (){
        return Destino;
    }
            
    public void AlteraDestino (String NovoDestino){
        this.Destino = NovoDestino;
    }
            
    public void NovaReserva(String nomePessoa, int cpf){
        /**
          *Se a lista de reservas não exceder a capacidade do voo
          * podemos gerar uma nova reserva,
          * armazenar os dados do cliente na mesma
          * e podemos anexar essa reserva na lista de reservas para esse Voo 
          */
        if(listaReservas.size()<NumerodeAssentos){
            Reserva novaReserva = new Reserva(nomePessoa,cpf);
            listaReservas.add(novaReserva);
            System.out.println("A reserva do(a) Sr(a) "
                    +novaReserva.ObterNomeUsuario()
                    +" Foi realizada com sucesso!");
        }else{
            System.out.println("Não existem mais assentos disponíveis nesse Voo!!");
        }
    }
    
    public void CancelaReserva (int cpf){
        
            
        
    }
}