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
public abstract class Dispositivo implements Comparable<Dispositivo>{
    protected int codDispositivo;
    protected String marca;
    protected int qtdEstoque;
    protected double valorDispositivo;
    
    public Dispositivo(int codDispositivo, String marca, int qtdEstoque, double valorDispositivo){
        this.codDispositivo = codDispositivo;
        this.marca = marca;
        this.qtdEstoque = qtdEstoque;
        this.valorDispositivo = valorDispositivo;
    }
    
    public Dispositivo(){}
    
    public abstract String getDescricaoDispositivo();
    
    public int getCodDispositivo() {
        return codDispositivo;
    }

    public String getMarca() {
        return marca;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public double getValorDispositivo() {
        return valorDispositivo;
    }
     
    public void setCodDispositivo(int codDispositivo) {
        this.codDispositivo = codDispositivo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void setValorDispositivo(double valorDispositivo) {
        this.valorDispositivo = valorDispositivo;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.codDispositivo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dispositivo other = (Dispositivo) obj;
        if (this.codDispositivo != other.codDispositivo) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Dispositivo outroDispositivo){
        double diferenca = this.getValorDispositivo() - outroDispositivo.getValorDispositivo();
        return (int)diferenca;
    }
}
