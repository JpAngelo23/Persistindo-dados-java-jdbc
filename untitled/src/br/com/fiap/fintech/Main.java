package br.com.fiap.fintech;

import br.com.fiap.fintech.DAO.*;
import br.com.fiap.fintech.DataBase.Conexao;
import br.com.fiap.fintech.model.*;

import java.sql.Connection;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws SQLException {

        InstFinanc brad = new InstFinanc();
        brad.setCnpj(12345678911111L);
        brad.setNome("Bradesco");

//        InstFinancDAO instFinanceira = new InstFinancDAO(Conexao.abrirConexao());

//        instFinanceira.gravarInstFinanceira(brad);
//        instFinanceira.excluirInstFinanceira(12345678911111L);



        Pessoa jp = new Pessoa();
        jp.setCdPessoa(1234567891L);
        jp.setNomePessoa("João Paulo");
        jp.setTel(11911223344L);
        jp.setCep("05868020");
        jp.setComplemento("Bairro: Jardim Das flores");

        Pessoa b3 = new Pessoa();
        b3.setCdPessoa(2023);
        b3.setNomePessoa("Bolsa de Valores de SP");
        b3.setTel(1144611070L);
        b3.setCep("05866090");
        b3.setComplemento("centro");

//        PessoaDAO pessoaDao = new PessoaDAO(Conexao.abrirConexao());

//        pessoaDao.gravarPessoa(jp);
//        pessoaDao.gravarPessoa(b3);
//        pessoaDao.excluirPessoa(jp);
//        pessoaDao.excluirPessoa(b3);


        Cliente joao = new Cliente();
        joao.setCdPessoa(1234567891L);
        joao.setCdCliente(12345);
        joao.setDsConta("conta do joao");
        joao.setDsSenha("Password");
        joao.setEmail("jp.angelo23@gmail.com");

        Cliente clienteB3 = new Cliente();
        clienteB3.setCdPessoa(2023);
        clienteB3.setCdCliente(1990);
        clienteB3.setDsConta("conta da BmF Bovespa");
        clienteB3.setDsSenha("PASSWORD!!");
        clienteB3.setEmail("b3@bovespa.com");

//        ClienteDAO clienteConexao = new ClienteDAO(Conexao.abrirConexao());

//        clienteConexao.adicionarCliente(joao);
//        clienteConexao.adicionarCliente(clienteB3);
//        clienteConexao.excluirCliente(12345);
//        clienteConexao.excluirCliente(1990);


        PessoaFisica joaoPF = new PessoaFisica();
        joaoPF.setCdCliente(12345);
        joaoPF.setCpf(40235789625L);
        joaoPF.setNrRg("0800");

//        PessoaFisicaDAO conexaoPF = new PessoaFisicaDAO(Conexao.abrirConexao());

//        conexaoPF.adicionarPf(joaoPF);
//        conexaoPF.excluirPF(12345L);


        PessoaJuridica b3PJ = new PessoaJuridica();
        b3PJ.setCdCliente(1990L);
        b3PJ.setCnpj(106223000150L);
        b3PJ.setDsInscricaoMunic("2000SP");

//        PessoaJuridicaDAO conexaoPJ = new PessoaJuridicaDAO(Conexao.abrirConexao());

//        conexaoPJ.adicionaPj(b3PJ);
//        conexaoPJ.excluirPJ(1990);

        //---------------------------------------------------------------------------------------------------------------------
// Excluindo os dados do Data Base:

        PessoaJuridicaDAO conexaoPJ = new PessoaJuridicaDAO(Conexao.abrirConexao());
        conexaoPJ.excluirPJ(1990);

        PessoaFisicaDAO conexaoPF = new PessoaFisicaDAO(Conexao.abrirConexao());
        conexaoPF.excluirPF(12345L);

        ClienteDAO clienteConexao = new ClienteDAO(Conexao.abrirConexao());
        clienteConexao.excluirCliente(12345);
        clienteConexao.excluirCliente(1990);

        PessoaDAO pessoaDao = new PessoaDAO(Conexao.abrirConexao());
        pessoaDao.excluirPessoa(jp);
        pessoaDao.excluirPessoa(b3);

        InstFinancDAO instFinanceira = new InstFinancDAO(Conexao.abrirConexao());
        instFinanceira.excluirInstFinanceira(12345678911111L);
//---------------------------------------------------------------------------------------------------------------------

    } //fim main

} //fim da Classe.

