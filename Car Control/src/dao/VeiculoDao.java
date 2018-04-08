package dao;

import classes.Veiculo;
import conexao.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

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
                Veiculo veiculo = new Veiculo(rs.getInt("id"), rs.getString("placa"), rs.getString("modelo"), rs.getString("tipo"), rs.getString("cor"), rs.getBoolean("bloqueado"), rs.getBoolean("status"));
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

    public void entrada(Veiculo veiculo) {
        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;
        Date date = new Date();
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sdt.format(date);

        try {
            stmt = con.prepareStatement("UPDATE veiculo SET status = 1 WHERE placa = ?");
            stmt.setString(1, veiculo.getPlaca());
            stmt.executeUpdate();
            stmt = con.prepareStatement("INSERT INTO entrada_saida (id_veiculo, momento, entrada_saida) VALUES (?,?,?)");
            stmt.setInt(1, veiculo.getId());
            stmt.setString(2, dateTime);
            stmt.setString(3, "Entrada");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Entrada realizada!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir entrada: " + e);
        } finally {
            Connect.closeConnection(con, stmt);
        }
    }

    public void saida(Veiculo veiculo) {
        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;
        Date date = new Date();
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sdt.format(date);

        try {
            stmt = con.prepareStatement("UPDATE veiculo SET status = 0 WHERE placa = ?");
            stmt.setString(1, veiculo.getPlaca());
            stmt.executeUpdate();
            stmt = con.prepareStatement("INSERT INTO entrada_saida (id_veiculo, momento, entrada_saida) VALUES (?,?,?)");
            stmt.setInt(1, veiculo.getId());
            stmt.setString(2, dateTime);
            stmt.setString(3, "Saída");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saída realizada!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir saída: " + e);
        } finally {
            Connect.closeConnection(con, stmt);
        }
    }

    public ResultSet listarVeiculos() {
        Connection con = Connect.getConnection();
        PreparedStatement stmt;
        ResultSet rs;

        try {
            stmt = con.prepareStatement("SELECT * FROM veiculo");
            rs = stmt.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar veículos: " + e);
        }
        return null;
    }

    public void alterar(Veiculo veiculo) {
        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE veiculo SET modelo = ?, tipo = ?, cor = ?, bloqueado = ? WHERE placa = ?");
            stmt.setString(1, veiculo.getModelo());
            stmt.setString(2, veiculo.getTipo());
            stmt.setString(3, veiculo.getCor());
            stmt.setBoolean(4, veiculo.isBloqueado());
            stmt.setString(5, veiculo.getPlaca());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar: " + e);
        } finally {
            Connect.closeConnection(con, stmt);
        }
    }

    public ResultSet entradaSaida() {
        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT v.placa, v.modelo, v.tipo, v.cor, ea.entrada_saida, ea.momento FROM entrada_saida as ea INNER JOIN veiculo as v ON v.id = ea.id_veiculo ORDER BY momento");
            rs = stmt.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar banco de dados: " + e);
        }
        return rs;
    }
}
