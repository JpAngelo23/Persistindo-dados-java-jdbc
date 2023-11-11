package br.com.fiap.fintech.model;

public class PessoaJuridica extends Cliente {

    private int cdCliente;
    private long cdPessoa;
    private int cnpj;
    private String dsInscricaoMunic;


  //---------------------------------
  // Getters and Setters:


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

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getDsInscricaoMunic() {
        return dsInscricaoMunic;
    }

    public void setDsInscricaoMunic(String dsInscricaoMunic) {
        this.dsInscricaoMunic = dsInscricaoMunic;
    }
}
