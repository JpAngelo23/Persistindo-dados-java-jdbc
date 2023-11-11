package br.com.fiap.fintech.model;

public class CPoupanca extends Conta {

    private int cdConta;
    private double txJuros;
    private double txIof;
    private double txIr;

//------------------------------------------------------------------------
    // Métodos Getters and Setters:


    @Override
    public int getCdConta() {
        return cdConta;
    }

    @Override
    public void setCdConta(int cdConta) {
        this.cdConta = cdConta;
    }

    public double getTxJuros() {
        return txJuros;
    }

    public void setTxJuros(double txJuros) {
        this.txJuros = txJuros;
    }

    public double getTxIof() {
        return txIof;
    }

    public void setTxIof(double txIof) {
        this.txIof = txIof;
    }

    public double getTxIr() {
        return txIr;
    }

    public void setTxIr(double txIr) {
        this.txIr = txIr;
    }
}
