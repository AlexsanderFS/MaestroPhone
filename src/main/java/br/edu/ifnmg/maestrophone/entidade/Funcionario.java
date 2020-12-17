/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.maestrophone.entidade;

/**
 *
 * @author maestro
 */
public class Funcionario extends Pessoa{
    protected String login;
    protected String senha;
    
    public Funcionario(String nome, String cpf, String email, String login, String senha){
        super(nome, cpf, email);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public String getDescricaoPessoa() {
        StringBuilder builder =  new StringBuilder();
        builder.append("Login:").append(this.login).append("\tSenha:").append(this.senha);
        System.out.print("\n");
        return builder.toString();
    }

    public boolean autenticar(String senha) {
        if (this.getSenha().equals(senha)) {
            return true;
        } else {
            return false;
        }
    }
}
