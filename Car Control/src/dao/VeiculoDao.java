package dao;

import classes.Veiculo;
import conexao.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public class VeiculoDao {

    public void cadastrar(Veiculo veiculo) {
        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO veiculo (placa, modelo, tipo, cor) VALUES (?,?,?,?)");
            stmt.setString(1, veiculo.getPlaca());
            stmt.setString(2, veiculo.getModelo());
            stmt.setString(3, veiculo.getTipo());
            stmt.setString(4, veiculo.getCor());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e);
        } finally {
            Connect.closeConnection(con, stmt);
        }
    }

    public Veiculo consultar(String placa) {
        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM veiculo WHERE placa = ?");
            stmt.setString(1, placa);
            rs = stmt.executeQuery();
            if (rs.next()) {
                Veiculo veiculo = new Veiculo(rs.getString("placa"), rs.getString("modelo"), rs.getString("tipo"), rs.getString("cor"), rs.getBoolean("bloqueado"), rs.getBoolean("status"));
                return veiculo;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar: " + e);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }
        return null;
    }

    public void bloquear(String placa) {
        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE veiculo SET bloqueado = 1 WHERE placa = ?");
            stmt.setString(1, placa);
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao bloquear: " + e);
        } finally {
            Connect.closeConnection(con, stmt);
        }
    }

    public void desbloquear(String placa) {
        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE veiculo SET bloqueado = 0 WHERE placa = ?");
            stmt.setString(1, placa);
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao desbloquear: " + e);
        } finally {
            Connect.closeConnection(con, stmt);
        }
    }
}
