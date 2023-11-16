package br.com.fiap.fintech.model;

public class CPoupanca extends Conta {

    private int cdConta;
    private double txRendimento;
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

    public double getTxRendimento() {
        return txRendimento;
    }

    public void setTxRendimento(double txRendimento) {
        this.txRendimento = txRendimento;
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
