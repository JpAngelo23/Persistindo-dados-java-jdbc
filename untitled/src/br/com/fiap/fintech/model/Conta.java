package br.com.fiap.fintech.model;

public class Conta {

    private int cdConta;
    private int instFinanc;
    private int cdClientePF;
    private int cdClientePJ;
    private int cdAgencia;
    private String nrConta;
    private double valorSaldo;
    private int cdMovimentacao;

    //------------------------------------------------------------------------
    // Métodos Getters and Setters:


    public int getCdConta() {
        return cdConta;
    }

    public void setCdConta(int cdConta) {
        this.cdConta = cdConta;
    }

    public int getInstFinanc() {
        return instFinanc;
    }

    public void setInstFinanc(int instFinanc) {
        this.instFinanc = instFinanc;
    }

    public int getCdClientePF() {
        return cdClientePF;
    }

    public void setCdClientePF(int cdClientePF) {
        this.cdClientePF = cdClientePF;
    }

    public int getCdClientePJ() {
        return cdClientePJ;
    }

    public void setCdClientePJ(int cdClientePJ) {
        this.cdClientePJ = cdClientePJ;
    }

    public int getCdAgencia() {
        return cdAgencia;
    }

    public void setCdAgencia(int cdAgencia) {
        this.cdAgencia = cdAgencia;
    }

    public String getNrConta() {
        return nrConta;
    }

    public void setNrConta(String nrConta) {
        this.nrConta = nrConta;
    }

    public double getValorSaldo() {
        return valorSaldo;
    }

    public void setValorSaldo(double valorSaldo) {
        this.valorSaldo = valorSaldo;
    }

    public int getCdMovimentacao() {
        return cdMovimentacao;
    }

    public void setCdMovimentacao(int cdMovimentacao) {
        this.cdMovimentacao = cdMovimentacao;
    }
}
