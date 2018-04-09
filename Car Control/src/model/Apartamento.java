package model;

import dao.ApartamentoDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static view.MainFrame.con;

public class Apartamento implements ApartamentoDao {

    private int id;
    private String numero;
    private int qtdVagas;
    private int qtdVeiculos;
    private int vagasDisponiveis;

    public Apartamento(int qtdVagas, int qtdVeiculos) {
        this.qtdVagas = qtdVagas;
        this.qtdVeiculos = qtdVeiculos;
    }

    public Apartamento(int qtdVagas, int qtdVeiculos, int vagasDisponiveis) {
        this.qtdVagas = qtdVagas;
        this.qtdVeiculos = qtdVeiculos;
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public Apartamento(String numero, int qtdVagas, int qtdVeiculos) {
        this.numero = numero;
        this.qtdVagas = qtdVagas;
        this.qtdVeiculos = qtdVeiculos;
    }

    public Apartamento(String numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public int getQtdVeiculos() {
        return qtdVeiculos;
    }

    public void setQtdVeiculos(int qtdVeiculos) {
        this.qtdVeiculos = qtdVeiculos;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    @Override
    public void cadastrar(Apartamento apto) {
        PreparedStatement stmt;

        try {
            stmt = con.prepareStatement("INSERT INTO apartamento (numero, qtdVagas, qtdVeiculos) VALUES(?, ?, ?)");
            stmt.setString(1, apto.getNumero());
            stmt.setInt(2, apto.getQtdVagas());
            stmt.setInt(3, apto.getQtdVeiculos());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Apartamento cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e);
        }
    }

    @Override
    public Apartamento consultar(String numero) {
        PreparedStatement stmt;
        ResultSet rs;

        try {
            stmt = con.prepareStatement("SELECT * FROM apartamento WHERE numero = ?");
            stmt.setString(1, numero);
            rs = stmt.executeQuery();
            if (rs.next()) {
                Apartamento apto = new Apartamento(rs.getInt("qtdVagas"), rs.getInt("qtdVeiculos"), rs.getInt("vagasDisponiveis"));
                return apto;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar dados: " + e);
        }
        return null;
    }
}
