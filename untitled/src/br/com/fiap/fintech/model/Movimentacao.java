package br.com.fiap.fintech.model;

public class Movimentacao {

    private int cdMovimentacao;
    private int cdConta;
    private int cdCliente;
    private String dsMovimentacao;
    private double valorMovimentacao;
    private String categoria;
    private int data;
    private String recorrencia;


    //------------------------------------------------------------------------
    // Métodos Getters and Setters:


    public int getCdMovimentacao() {
        return cdMovimentacao;
    }

    public void setCdMovimentacao(int cdMovimentacao) {
        this.cdMovimentacao = cdMovimentacao;
    }

    public int getCdConta() {
        return cdConta;
    }

    public void setCdConta(int cdConta) {
        this.cdConta = cdConta;
    }

    public int getCdCliente() {
        return cdCliente;
    }

    public void setCdCliente(int cdCliente) {
        this.cdCliente = cdCliente;
    }

    public String getDsMovimentacao() {
        return dsMovimentacao;
    }

    public void setDsMovimentacao(String dsMovimentacao) {
        this.dsMovimentacao = dsMovimentacao;
    }

    public double getValorMovimentacao() {
        return valorMovimentacao;
    }

    public void setValorMovimentacao(double valorMovimentacao) {
        this.valorMovimentacao = valorMovimentacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getRecorrencia() {
        return recorrencia;
    }

    public void setRecorrencia(String recorrencia) {
        this.recorrencia = recorrencia;
    }
}
