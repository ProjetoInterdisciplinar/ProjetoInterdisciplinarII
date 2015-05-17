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
         if (this.VerificaIndexNumeroVoo(voo.ObterNumero()) > -1) {
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
                 if (item.ObterNumero()== numero) {
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
     
     public String AdicionarReserva(int vooNumero, String reservaNome, int reservaCPF) {
         String rtn;
         int indexVoo = this.VerificaIndexNumeroVoo(vooNumero);
         
         if (indexVoo > -1) {
            Reserva reserva = new Reserva(reservaNome, reservaCPF);
            rtn = listaVoos.get(indexVoo).NovaReserva(reserva);
         } else {
            rtn = "Não existem voo com o número " + vooNumero;
         }
         
         return rtn;
     }
     
     public void ListarVoos() {
         if (this.listaVoos.size() > 0) {
             System.out.printf("%1s %-7s %-7s %1s %1s%n", "Número",  "Origem", "Destino", "Nro Assentos", "Nro Reservas");
             
             for (Voo item : this.listaVoos) {
                System.out.printf("%1s %9s %9s %10s %5s%n",
                                  item.ObterNumero(),
                                  item.ObterOrigem(),
                                  item.ObterDestino(),
                                  item.ObterNumerodeAcentos(),
                                  item.ObterNumerodeReservas());
             }
         } else {
             System.out.println("Nenhum voo cadastrado");
         }
     }
     
     public void ListarReservas() {
         if (this.listaVoos.size() > 0) {
             System.out.printf("%10s %-7s %-7s%n", "Número Voo",  "Nome", "CPF");
             
             for (Voo voo : this.listaVoos) {
                 for (Reserva reserva : voo.ObterReservas()) {
                    System.out.printf("%10s %-7s %-7s%n",
                                      voo.ObterNumero(),
                                      reserva.ObterNomeUsuario(),
                                      reserva.ObterCpf()
                                      );
                 }
             }
         } else {
             System.out.println("Nenhum voo cadastrado");
         }
     }      
     
    
}
