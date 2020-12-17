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
public class Cliente extends Pessoa{
    protected String telefone;
    protected String rua;
    protected int numero;
    protected String bairro;
    
    public Cliente(String nome, String cpf, String email, String telefone, String rua,
               int numero, String bairro){
        super(nome, cpf, email);
        this.telefone = telefone;
        this.rua = rua;
        this.numero = numero;
        this.bairro  = bairro;
    }

    public Cliente() {}
    
    public String getTelefone() {
        return telefone;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    @Override
    public String getDescricaoPessoa() {
        StringBuilder builder =  new StringBuilder();
        builder.append("\tTEL: ").append(this.telefone).
                append("\tRua: ").append(this.rua).
                append("\tNº: ").append(this.numero).
                append("\tBairro: ").append(this.bairro);
        System.out.print("\n");
        return builder.toString();
    }
}
