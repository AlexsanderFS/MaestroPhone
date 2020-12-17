/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.maestrophone.entidade;

import java.util.Date;

/**
 *
 * @author maestro
 */
public class TransacaoFinanceira {
    protected int codTransacao;
    protected Date data;
    protected int qtdPedido;
    protected double valorFrete;
    protected double valorTotal;
    protected String tipoDoPagamento;

    public int getCodTransacao() {
        return codTransacao;
    }

    public Date getData() {
        return data;
    }

    public int getQtdPedido() {
        return qtdPedido;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getTipoDoPagamento() {
        return tipoDoPagamento;
    }

    public void setCodTransacao(int codTransacao) {
        this.codTransacao = codTransacao;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setQtdPedido(int qtdPedido) {
        this.qtdPedido = qtdPedido;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setTipoDoPagamento(String tipoDoPagamento) {
        this.tipoDoPagamento = tipoDoPagamento;
    }
    
    
}
