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
public class Bateria extends Dispositivo{
    protected String tipoDaBateria;
    protected int ampere;
    
    public Bateria(int codDispositivo, String marca, int qtdEstoque, double valorDispositivo, String tipoDaBateria, int ampere) {
        super(codDispositivo, marca, qtdEstoque, valorDispositivo);
        this.tipoDaBateria = tipoDaBateria;
        this.ampere = ampere;
    }

    public Bateria() {
    }

    public String getTipoDaBateria() {
        return tipoDaBateria;
    }

    public int getAmpere() {
        return ampere;
    }

    public void setTipoDaBateria(String tipoDaBateria) {
        this.tipoDaBateria = tipoDaBateria;
    }

    public void setAmpere(int ampere) {
        this.ampere = ampere;
    }

    @Override
    public String getDescricaoDispositivo() {
        StringBuilder builder =  new StringBuilder();
        builder.append("\tTipo: ").append(this.tipoDaBateria).append("\tAmpere: ").append(this.ampere);
        System.out.print("\n");
        return builder.toString();
    }    
}
