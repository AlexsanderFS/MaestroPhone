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
public class Memoria extends Dispositivo{
    protected double taxaDeTransferenciaHD;
    protected int armazenamentoHD;
    protected int tamanhoRAM;
    protected double frequenciaRAM;

    public Memoria(int codDispositivo, String marca, int qtdEstoque, double valorDispositivo,
            double taxaDeTransferenciaHD, int armazenamentoHD, int tamanhoRAM, double frequenciaRAM) {
        super(codDispositivo, marca, qtdEstoque, valorDispositivo);
        this.taxaDeTransferenciaHD = taxaDeTransferenciaHD;
        this.armazenamentoHD = armazenamentoHD;
        this.tamanhoRAM = tamanhoRAM;
        this.frequenciaRAM = frequenciaRAM;
    }

    public Memoria() {}

    public double getTaxaDeTransferenciaHD() {
        return taxaDeTransferenciaHD;
    }

    public int getArmazenamentoHD() {
        return armazenamentoHD;
    }

    public int getTamanhoRAM() {
        return tamanhoRAM;
    }

    public double getFrequenciaRAM() {
        return frequenciaRAM;
    }

    public void setTaxaDeTransferenciaHD(double taxaDeTransferenciaHD) {
        this.taxaDeTransferenciaHD = taxaDeTransferenciaHD;
    }

    public void setArmazenamentoHD(int armazenamentoHD) {
        this.armazenamentoHD = armazenamentoHD;
    }

    public void setTamanhoRAM(int tamanhoRAM) {
        this.tamanhoRAM = tamanhoRAM;
    }

    public void setFrequenciaRAM(double frequenciaRAM) {
        this.frequenciaRAM = frequenciaRAM;
    }
    
    @Override
    public String getDescricaoDispositivo() {
        StringBuilder builder =  new StringBuilder();
        builder.append("\tHD - GB: ").append(this.armazenamentoHD).
                append("\tRAM - GB: ").append(this.tamanhoRAM).
                append("\tTranf HD: ").append(this.taxaDeTransferenciaHD).
                append("\tFreq RAM: ").append(this.frequenciaRAM);
        System.out.print("\n");
        return builder.toString();
    }
    
}   
