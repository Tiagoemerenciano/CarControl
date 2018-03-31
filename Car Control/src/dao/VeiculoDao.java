package dao;

import classes.Veiculo;
import conexao.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public class VeiculoDao {
    public void cadastrar(Veiculo veiculo){
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
}
