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
public class Celular {
    protected int codigoCell;
    protected String cor;

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }
    protected String sistemaOperacional;
    protected double valorTotal;
    
    protected Bateria bateria;
    protected Camera camera;
    protected Display display;
    protected Memoria memoria;
    protected Processador processador;
    
    public Bateria getBateria(){
        return bateria;
    }

    public Camera getCamera() {
        return camera;
    }

    public Display getDisplay() {
        return display;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public Processador getProcessador() {
        return processador;
    } 
    
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public String getCor() {
        return cor;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    
    public void setCodigoCell(int codigoCell) {
        this.codigoCell = codigoCell;
    }

    public int getCodigoCell() {
        return codigoCell;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
