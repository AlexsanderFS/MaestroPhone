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
public class Display extends Dispositivo{
    protected double polegadas;
    protected String resolucao;
    protected String tipoDisplay;
    protected String qtdCores;

    public Display(int codDispositivo, String marca, int qtdEstoque, double valorDispositivo,
            double polegadas, String resolucao, String tipoDisplay, String qtdCores) {
        super(codDispositivo, marca, qtdEstoque, valorDispositivo);
        this.polegadas = polegadas;
        this.resolucao = resolucao;
        this.tipoDisplay = tipoDisplay;
        this.qtdCores = qtdCores;
    }

    public Display() {}

    public double getPolegadas() {
        return polegadas;
    }

    public String getResolucao() {
        return resolucao;
    }

    public String getTipoDisplay() {
        return tipoDisplay;
    }

    public String getQtdCores() {
        return qtdCores;
    }

    public void setPolegadas(double polegadas) {
        this.polegadas = polegadas;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public void setTipoDisplay(String tipoDisplay) {
        this.tipoDisplay = tipoDisplay;
    }

    public void setQtdCores(String qtdCores) {
        this.qtdCores = qtdCores;
    }
    
    @Override
    public String getDescricaoDispositivo() {
        StringBuilder builder =  new StringBuilder();
        builder.append("\tPolegadas: ").append(this.polegadas).
                append("\tResolução: ").append(this.resolucao).
                append("\tDisplay: ").append(this.tipoDisplay).
                append("\tCores: ").append(this.qtdCores);
        System.out.print("\n");
        return builder.toString();
    }
}
