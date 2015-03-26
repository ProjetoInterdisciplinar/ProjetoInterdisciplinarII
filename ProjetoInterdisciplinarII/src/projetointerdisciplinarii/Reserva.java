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
    
    public void Reserva(String usuario, int cpf){
        this.usuario = usuario;
        this.cpf = cpf;
    }
    
    public String[] ObterInfo(){
        String numCpf = Integer.toString(this.cpf);
        String[] conteudo = {this.usuario , numCpf };
        return conteudo;
    }
    
    public String ObterNomeUsuario(){
        return this.usuario;
    }
    
    public void AlterarNomeUsuario(String novoNome){
        this.usuario = novoNome;
        System.out.println("Usuário alterado com sucesso");
    }
    
    public int ObterCpf(){
        return this.cpf;
    }
    
    public void AlterarCpf(int novoCpf){
        this.cpf = novoCpf;
    }
    
    public void AlterarCpf(String novoCpf){
        this.cpf = Integer.getInteger(novoCpf.trim());
    }
}
