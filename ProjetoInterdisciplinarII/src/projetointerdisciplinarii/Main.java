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

                //Verifico se a informação de entrada é maior que zero e menor que 4
                if (opcaoMenu > 0 && opcaoMenu < 4)
                    dadoCorreto = true;

                if (dadoCorreto)
                {
                    if (opcaoMenu == 1)
                            Opcao1();
                    else if (opcaoMenu == 2)
                            Opcao2();
                    else if (opcaoMenu == 3)
                            Opcao3();
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
        String strMenu = "MENU \n Escolha a opção: \n 1 - Cadastrar Voo \n 2 - Exibir atual \n 3 - Sair";
        System.out.println(strMenu);
    }
    
    public static void Opcao1() {
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
        
        System.out.println(gerencia.adicionarVoo(vooItem));
        
        System.out.println("");
        System.out.println("");        
        IniciaPrograma();
    }
    
    public static void Opcao2() {
        //System.out.println(gerencia.listarLivrosAtual());
        System.out.println("");
        System.out.println("");
        IniciaPrograma();
    }
    
    public static void Opcao3() {
        System.exit(0);
    }      
}