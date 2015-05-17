/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointerdisciplinarii;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TiagoSarri
 */
public class Main {
    
    private static GerenciaVoos gerencia = new GerenciaVoos();
    
    public static void main(String[] args) {
        try {
            IniciaPrograma();
        }  
        catch (Exception ex) {
                System.out.println("Ocorreu um problema: ");
                ex.printStackTrace();
        }
    }
    
    public static void IniciaPrograma()
    {
        Scanner scaMenu = new Scanner(System.in);
        int opcaoMenu = 0;
        Boolean dadoCorreto = false;

        try	
        {
            ExibeMenu();

            //Enquanto a informação de entrada não estiver correta, continua aparecendo o menu.
            while (!dadoCorreto) {
                scaMenu = new Scanner(System.in);

                //Verifico se a informação de entrada é um inteiro
                if (scaMenu.hasNextInt())
                        opcaoMenu = scaMenu.nextInt();

                //Verifico se a informação de entrada é maior que zero e menor que 7
                if (opcaoMenu > 0 && opcaoMenu < 7)
                    dadoCorreto = true;

                if (dadoCorreto)
                {
                    if (opcaoMenu == 1)
                            OpcaoCadastrarVoo();
                    else if (opcaoMenu == 2)
                            OpcaoCancelarVoo();
                    else if (opcaoMenu == 3)
                            OpcaoCadastrarReserva();
                    else if (opcaoMenu == 4)
                            OpcaoListarReservas();
                    else if (opcaoMenu == 5)
                            OpcaoListarVoos();
                    else if (opcaoMenu == 6)
                            OpcaoSair();                    
                } else {
                    System.out.println("Por favor escolha uma opção válida");
                    ExibeMenu();
                }
            }
        }
        finally {
            //Realizo um dispose dos objetos necessarios para garantir a performance de mémoria
            if (scaMenu != null)
            {
                scaMenu.close();
                scaMenu = null;
            }
        }
    }
    
    public static void ExibeMenu() {
        String strMenu = "MENU \n Escolha a opção: \n 1 - Cadastrar Voo \n 2 - Cancelamento de voo \n 3 - Nova reserva \n 4 - Lista de Reserva \n 5 - Lista de Voo \n 6 - Sair";
        System.out.println(strMenu);
    }
    
    public static void OpcaoCadastrarVoo() {
        Scanner scaMenu = new Scanner(System.in);
        String vooOrigem, vooDestino;
        int vooNumero, vooNumeroAssentos;
        Voo vooItem;
        
        System.out.println("Informe o número do voo:");
        vooNumero = scaMenu.nextInt();
        
        System.out.println("Informe a origem do voo:");
        vooOrigem = scaMenu.next();
        
        System.out.println("Informe o destino do voo:");
        vooDestino = scaMenu.next();
        
        System.out.println("Informe o número de assentos do voo:");
        vooNumeroAssentos = scaMenu.nextInt();
        
        vooItem = new Voo(vooNumero, vooOrigem, vooDestino, vooNumeroAssentos);
        
        System.out.println(gerencia.AdicionarVoo(vooItem));
        
        System.out.println("");
        System.out.println("");  
        
        IniciaPrograma();
    }
    
    public static void OpcaoCancelarVoo() {
        Scanner scaMenu = new Scanner(System.in);
        int vooNumero;
        
        System.out.println("Informe o número do voo:");
        vooNumero = scaMenu.nextInt();
        
        System.out.println(gerencia.CancelarVoo(vooNumero));
        
        System.out.println("");
        System.out.println("");  
        
        IniciaPrograma();
    }
    
    public static void OpcaoCadastrarReserva() {
        Scanner scaMenu = new Scanner(System.in);
        String reservaNome;
        int reservaCPF, vooNumero;
        
        if (gerencia.ExisteVooCadastrado())
        {
            System.out.println("Informe o número do voo:");
            vooNumero = scaMenu.nextInt();

            System.out.println("Informe o seu nome:");
            reservaNome = scaMenu.next();

            System.out.println("Informe o seu CPF:");
            reservaCPF = scaMenu.nextInt();

            System.out.println(gerencia.AdicionarReserva(vooNumero, reservaNome, reservaCPF));
        } else {
            System.out.println("É necessário a inclusão de um voo antes de fazer uma reserva");
        }
        
        System.out.println("");
        System.out.println("");  
        
        IniciaPrograma();
    }    
    
    public static void OpcaoListarVoos()
    {
        gerencia.ListarVoos();
        System.out.println("");
        System.out.println("");
        IniciaPrograma();        
    }
    
    public static void OpcaoListarReservas()
    {
        gerencia.ListarReservas();
        System.out.println("");
        System.out.println("");
        IniciaPrograma();        
    }
    
    public static void OpcaoSair() {
        System.exit(0);
    }      
}