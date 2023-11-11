package br.com.fiap.fintech.DAO;

import br.com.fiap.fintech.model.CCorrente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CCorrenteDAO {

    private Connection conexao;

    public CCorrenteDAO(Connection conexao) {
        this.conexao = conexao;
    }



    public void gravarConta(CCorrente conta) {
        String sql = "INSERT INTO T_CCORRENTE (CD_CONTA, TX_JUROS, TX_IOF, TX_IR)"
                + "VALUES (SEQUENCE1.NEXTVAL, ?, ?, ?)";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setDouble(1, conta.getTxJuros());

            ps.setDouble(2, conta.getTxIof());
            ps.setDouble(3, conta.getTxIr());
            ps.execute();
            ps.close();
            System.out.println("Conta gravada com sucesso!");
            conexao.close();
            System.out.println("Conexão Encerrada.");
        } catch (SQLException e) {
            System.out.println("Deu Ruim.");
            e.printStackTrace();
        }

    }
    //-------------------------------------------------------------------

    public boolean excluirConta(int idConta) {
        String sql = "DELETE FROM T_CCORRENTE WHERE T_CONTA_CD_CONTA = ?";
        PreparedStatement ps = null;

        try {
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, idConta);
            int rowsAffected = ps.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao excluir conta.");
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (ps != null && !ps.isClosed()) {
                    ps.close();
                    System.out.println("Conta Excluída com sucesso.");
                }
                // Não feche a conexão aqui se pretender reusá-la
                conexao.close();
                // Conexões são normalmente fechadas fora do DAO, ou usando try-with-resources
            } catch (SQLException ex) {
                System.out.println("Erro ao fechar recursos.");
                ex.printStackTrace();
            }
        }
    }

    public boolean atualizarTxJuros(int idConta, double novoTxJuros) {
        return atualizarCampoConta(idConta, "TX_JUROS", novoTxJuros);
    }

    public boolean atualizarTxIof(int idConta, double novoTxIof) {
        return atualizarCampoConta(idConta, "TX_IOF", novoTxIof);
    }

    public boolean atualizarTxIr(int idConta, double novoTxIr) {
        return atualizarCampoConta(idConta, "TX_IR", novoTxIr);
    }

    private boolean atualizarCampoConta(int idConta, String nomeCampo, double novoValor) {
        String sql = "UPDATE T_CCORRENTE SET " + nomeCampo + " = ? WHERE T_CONTA_CD_CONTA = ?";
        PreparedStatement ps = null;

        try {
            ps = conexao.prepareStatement(sql);
            ps.setDouble(1, novoValor);
            ps.setInt(2, idConta);

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar " + nomeCampo + ".");
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (ps != null && !ps.isClosed()) {
                    ps.close();
                }
                // A conexão não é fechada aqui, pois pode ser usada novamente
            } catch (SQLException ex) {
                System.out.println("Erro ao fechar PreparedStatement.");
                ex.printStackTrace();
            }
        }
    }

}
