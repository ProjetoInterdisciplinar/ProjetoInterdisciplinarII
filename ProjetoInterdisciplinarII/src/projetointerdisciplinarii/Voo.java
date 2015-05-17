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
    
    public String NovaReserva(Reserva reserva){
        if(numerodeAssentos > 0){
            listaReservas.add(reserva);
            numerodeAssentos--;
            
            return "A reserva do(a) Sr(a) "
                    +reserva.ObterNomeUsuario()
                    +" Foi realizada com sucesso!";
            
        }else{
            return "Não existem mais assentos disponíveis nesse Voo!!";
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
    
    //@Override
    public boolean equals(Voo voo) {
        if (voo == null) {
            return false;
        }
        
        return voo.numero == this.numero
            || (this.numero > 0 && this.numero == voo.numero);
    }    
}