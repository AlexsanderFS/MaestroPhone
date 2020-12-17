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
public class Camera extends Dispositivo{
    protected String tipoDaCamera;
    protected int megapixel;
    protected int fpsGravacao;
    protected String resolucaoGravacao;
    protected String resolucaoFoto;
    protected String tipoDeFlash;  

    public Camera(int codDispositivo, String marca, int qtdEstoque,
            double valorDispositivo, String tipoDaCamera, int megapixel,
            int fpsGravacao, String resolucaoGravacao, String resolucaoFoto,
            String tipoDeFlash) {
        super(codDispositivo, marca, qtdEstoque, valorDispositivo);
        this.tipoDaCamera = tipoDaCamera;
        this.megapixel = megapixel;
        this.fpsGravacao = fpsGravacao;
        this.resolucaoGravacao = resolucaoGravacao;
        this.resolucaoFoto = resolucaoFoto;
        this.tipoDeFlash = tipoDeFlash;
    }

    public Camera() {}

    public String getTipoDaCamera() {
        return tipoDaCamera;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public int getFpsGravacao() {
        return fpsGravacao;
    }

    public String getResolucaoGravacao() {
        return resolucaoGravacao;
    }

    public String getResolucaoFoto() {
        return resolucaoFoto;
    }

    public String getTipoDeFlash() {
        return tipoDeFlash;
    }

    public void setTipoDaCamera(String tipoDaCamera) {
        this.tipoDaCamera = tipoDaCamera;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
    }

    public void setFpsGravacao(int fpsGravacao) {
        this.fpsGravacao = fpsGravacao;
    }

    public void setResolucaoGravacao(String resolucaoGravacao) {
        this.resolucaoGravacao = resolucaoGravacao;
    }

    public void setResolucaoFoto(String resolucaoFoto) {
        this.resolucaoFoto = resolucaoFoto;
    }

    public void setTipoDeFlash(String tipoDeFlash) {
        this.tipoDeFlash = tipoDeFlash;
    }
    
    @Override
    public String getDescricaoDispositivo() {
        StringBuilder builder =  new StringBuilder();
        builder.append("\tTipo: ").append(this.tipoDaCamera).
                append("\tMegapixel: ").append(this.megapixel).
                append("\tFps: ").append(this.fpsGravacao).
                append("\tVideo: ").append(this.resolucaoGravacao).
                append("\tFoto: ").append(this.resolucaoFoto).
                append("\tFlash: ").append(this.tipoDeFlash);
        System.out.print("\n");
        return builder.toString();
    }   
    
}
