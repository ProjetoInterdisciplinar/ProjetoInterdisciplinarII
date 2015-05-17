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
    private ArrayList <Reserva> listaReservas;
    
    public Voo(int numero, String origem, String destino, int numerodeAssentos){
        listaReservas = new ArrayList();
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.numerodeAssentos = numerodeAssentos;
    }
    
    public int RetornaNumero (){
        return numero;
    }
    
    public void AlteraNumero(int NovoNumero) {
        this.numero = NovoNumero;
    }
    
    public  String RetornaOrigem (){ 
        return origem;
    }
    
    public void AlteraOrigem (String novaOrigem){ 
        this.origem = novaOrigem;
    }
    
    public String RetornaDestino (){
        return destino;
    }
            
    public void AlteraDestino (String novoDestino){
        this.destino = novoDestino;
    }
    
    public int NumAcentosDisponiveis(){
     return numerodeAssentos;  
    }
    
    public static void AdicionaVoo(int numeroVoo, String Origem, String Destino, int numerodeAssentos){
        //Voo novoVoo = new Voo(numeroVoo, Origem, Destino, numerodeAssentos);        
        //listaVoos.add(novoVoo);        
        //System.out.println("Novo Voo foi adicionado com sucesso!");
    }    
            
    public void NovaReserva(String nomePessoa, int cpf){
        /**
          *Se a lista de reservas não exceder a capacidade do voo
          * podemos gerar uma nova reserva,
          * armazenar os dados do cliente na mesma
          * e podemos anexar essa reserva na lista de reservas para esse Voo 
          */
        if(numerodeAssentos > 0){
            Reserva novaReserva = new Reserva(nomePessoa,cpf);
            listaReservas.add(novaReserva);
            System.out.println("A reserva do(a) Sr(a) "
                    +novaReserva.ObterNomeUsuario()
                    +" Foi realizada com sucesso!");            
        numerodeAssentos--;
        }else{
            System.out.println("Não existem mais assentos disponíveis nesse Voo!!");
        }        
    }
    
    public void CancelaReserva (int cpf){        
        if(!listaReservas.isEmpty()){
            for(Reserva reserva : listaReservas){
                if(reserva.ObterCpf() == cpf){
                    System.out.println("Deseja excuir a seguinte reserva?\nNome : "
                            +reserva.ObterNomeUsuario()
                            +"\nCPF : "
                            +reserva.ObterCpf()
                            +"Digite 's' para CONFIRMAR ou outra tecla para CANCELAR");
                    //if("s".equals(teclado.next().toLowerCase())){
                        //listaReservas.remove(reserva);
                        //System.out.println("Reserva cancelada com sucesso!!");
                    //}else{
                      //  System.out.println("A operação foi cancelada pelo usuário!!");
                    //}
                }
            }
        }else{
            System.out.println("Não existem reservas nesse Voo");
        }
    }
}