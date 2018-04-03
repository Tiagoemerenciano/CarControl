package dao;

import classes.Apartamento;
import conexao.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ApartamentoDao {

    public void cadastrar(Apartamento apto) {

        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO apartamento (numero, qtdVagas, qtdVeiculos) VALUES(?, ?, ?)");
            stmt.setString(1, apto.getNumero());
            stmt.setInt(2, apto.getQtdVagas());
            stmt.setInt(3, apto.getQtdVeiculos());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Apartamento cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e);
        } finally{
            Connect.closeConnection(con, stmt);
        }

    }
    
    public Apartamento consultarApartamento(String numero){
        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM apartamento WHERE numero = ?");
            stmt.setString(1, numero);
            rs = stmt.executeQuery();
            if(rs.next()){
                Apartamento apto = new Apartamento(rs.getInt("qtdVagas"), rs.getInt("qtdVeiculos"));
                return apto;
            }
        } catch (SQLException ex) {
            String e = null;
            JOptionPane.showMessageDialog(null, "Erro ao recuperar dados: " + e);
        }finally {
            Connect.closeConnection(con, stmt, rs);
        }
        return null;
    }

}
