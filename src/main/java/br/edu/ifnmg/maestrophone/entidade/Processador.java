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
public class Processador extends Dispositivo{
    
    protected int qtdNucleos;
    protected double qtdClocks;
    
    public Processador(int codDispositivo, String marca, int qtdEstoque, double valorDispositivo, int qtdNucleos, double qtdClocks) {
        super(codDispositivo, marca, qtdEstoque, valorDispositivo);
        this.qtdNucleos = qtdNucleos;
        this.qtdClocks = qtdClocks;
    }

    public Processador() {}

    public int getQtdNucleos() {
        return qtdNucleos;
    }

    public double getQtdClocks() {
        return qtdClocks;
    }

    public void setQtdNucleos(int qtdNucleos) {
        this.qtdNucleos = qtdNucleos;
    }

    public void setQtdClocks(double qtdClocks) {
        this.qtdClocks = qtdClocks;
    }   
    
    /**
     *
     * @return
     */
    @Override
    public String getDescricaoDispositivo() {
        StringBuilder builder =  new StringBuilder();
        builder.append("\tNucleos: ").append(this.qtdNucleos).append("\tClocks: ").append(this.qtdClocks);
        System.out.print("\n");
        return builder.toString();
    }
}
