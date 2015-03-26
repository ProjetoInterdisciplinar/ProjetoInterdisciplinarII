/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointerdisciplinarii;

/**
 *
 * @author Tiago Silva do Nascimento
 * Projeto Interdiciplinar II
 * ----------------------------
 * cadnuns.dimir@gmail.com 
 * cadnunsdimir.github.io
 * --------------------------
 * Classe resposável por gerar as reservas
 * dos Voos.
 * 
 */
public class Reserva {
    private String usuario;
    private int cpf;
    
    public Reserva(String usuario, int cpf){
        this.usuario = usuario;
        this.cpf = cpf;
    }
    
    public String[] getInfo(){
        String numCpf = Integer.toString(this.cpf);
        String[] conteudo = {this.usuario , numCpf };
        return conteudo;
    }
    
    public String getNomeUsuario(){
        return this.usuario;
    }
    
    public void setNomeUsuario(String novoNome){
        this.usuario = novoNome;
        System.out.println("Usuário alterado com sucesso");
    }
    
    public int getCpf(){
        return this.cpf;
    }
    
    public void setCpf(int novoCpf){
        this.cpf = novoCpf;
    }
    
    public void setCpf(String novoCpf){
        this.cpf = Integer.getInteger(novoCpf.trim());
    }
}
