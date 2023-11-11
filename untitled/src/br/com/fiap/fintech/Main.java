package br.com.fiap.fintech;

import br.com.fiap.fintech.DAO.CCorrenteDAO;
import br.com.fiap.fintech.DAO.InstFinancDAO;
import br.com.fiap.fintech.DAO.PessoaDAO;
import br.com.fiap.fintech.DataBase.Conexao;
import br.com.fiap.fintech.model.CCorrente;
import br.com.fiap.fintech.model.InstFinanc;
import br.com.fiap.fintech.model.Pessoa;

import java.sql.Connection;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws SQLException {

        //Criando o objeto (instanciando) ContaDAO, para abrir a conexão e chamar os métodos que serão usados para persistência dos dados
        //CCorrenteDAO contaDao = new CCorrenteDAO(Conexao.abrirConexao());


//        CCorrente contaJP = new CCorrente();
//        contaJP.setTxJuros(4.5);
//        contaJP.setTxIof(0.3);
//        contaJP.setTxIr(0.4);
//        contaDao.gravarConta(contaJP);

        InstFinanc brad = new InstFinanc();
        brad.setCnpj(12345678911111L);
        brad.setNome("Bradesco");

        InstFinancDAO instFinanceira = new InstFinancDAO(Conexao.abrirConexao());
        //instFinanceira.gravarInstFinanceira(brad);
        //instFinanceira.excluirInstFinanceira(12345678911111L);



        Pessoa jp = new Pessoa();
        jp.setCdPessoa(1234567891L);
        jp.setNomePessoa("João Paulo");
        jp.setTel(11987219821L);
        jp.setCep("05866020");
        jp.setComplemento("Bairro: Jardim Mariane");

        PessoaDAO pessoaDao = new PessoaDAO(Conexao.abrirConexao());

        //pessoaDao.gravarPessoa(jp);
        pessoaDao.excluirPessoa(jp);
        instFinanceira.excluirInstFinanceira(12345678911111L);





//
//        CCorrente contaSuricato = new CCorrente();
//        contaSuricato.setTxJuros(5.5);
//        contaSuricato.setTxIof(1.5);
//        contaSuricato.setTxIr(0.3);
//        contaDao.gravarConta(contaSuricato);
//
//        CCorrente contaBernardo = new CCorrente(2.5, 1.0, 0.3);
//        contaDao.gravarConta(contaBernardo);
//        CCorrente contaKauan = new CCorrente(2.5, 1.0, 0.3);
//        contaDao.gravarConta(contaKauan);

        //contaDao.excluirConta(135);





        //contaDao.excluirConta(115);
        //contaDao.excluirConta(125);

       // contaDao.atualizarTxJuros(145, 9.9);






//        contaDao.excluirConta(105);






    } //fim main
} //fim
