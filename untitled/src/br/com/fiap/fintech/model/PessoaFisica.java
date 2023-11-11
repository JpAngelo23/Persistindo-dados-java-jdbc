package br.com.fiap.fintech.model;

public class PessoaFisica extends  Cliente {

    private int cdCliente;
    private long cdPessoa;
    private int cpf;
    private String nrRg;


// -----------------------------------------------------


    public int getCdCliente() {
        return cdCliente;
    }

    public void setCdCliente(int cdCliente) {
        this.cdCliente = cdCliente;
    }

    public long getCdPessoa() {
        return cdPessoa;
    }

    public void setCdPessoa(long cdPessoa) {
        this.cdPessoa = cdPessoa;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNrRg() {
        return nrRg;
    }

    public void setNrRg(String nrRg) {
        this.nrRg = nrRg;
    }
}
