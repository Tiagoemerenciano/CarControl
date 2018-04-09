package model;

import dao.VeiculoDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static view.MainFrame.con;

public class Veiculo extends Controle implements VeiculoDao {

    private int id;
    private String placa;
    private String modelo;
    private String tipo;
    private String cor;
    private String apartamento;

    public Veiculo() {
    }

    public Veiculo(String placa) {
        this.placa = placa;
    }

    public Veiculo(String placa, String modelo, String tipo, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.cor = cor;
    }

    public Veiculo(String placa, String modelo, String tipo, String cor, String apartamento) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.cor = cor;
        this.apartamento = apartamento;
    }

    public Veiculo(String placa, String modelo, String tipo, String cor, boolean bloqueado, boolean status) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.cor = cor;
        setStatus(status);
        setBloqueado(bloqueado);
    }

    public Veiculo(int id, String placa, String modelo, String tipo, String cor, boolean bloqueado, boolean status) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.cor = cor;
        setStatus(status);
        setBloqueado(bloqueado);
    }

    public Veiculo(int id, String placa, String modelo, String tipo, String cor, boolean bloqueado, boolean status, String apartamento) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.cor = cor;
        setStatus(status);
        setBloqueado(bloqueado);
        this.apartamento = apartamento;
    }

    public Veiculo(String placa, String modelo, String tipo, String cor, boolean bloqueado) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.cor = cor;
        setBloqueado(bloqueado);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    @Override
    public void cadastrar(Veiculo veiculo) {
        PreparedStatement stmt;

        try {
            stmt = con.prepareStatement("INSERT INTO veiculo (placa, modelo, tipo, cor, apartamento) VALUES (?,?,?,?,?)");
            stmt.setString(1, veiculo.getPlaca());
            stmt.setString(2, veiculo.getModelo());
            stmt.setString(3, veiculo.getTipo());
            stmt.setString(4, veiculo.getCor());
            stmt.setString(5, veiculo.getApartamento());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e);
        }
    }

    @Override
    public Veiculo consultar(String placa) {
        PreparedStatement stmt;
        ResultSet rs;

        try {
            stmt = con.prepareStatement("SELECT * FROM veiculo WHERE placa = ?");
            stmt.setString(1, placa);
            rs = stmt.executeQuery();
            if (rs.next()) {
                Veiculo veiculo = new Veiculo(rs.getInt("id"), rs.getString("placa"), rs.getString("modelo"), rs.getString("tipo"), rs.getString("cor"), rs.getBoolean("bloqueado"), rs.getBoolean("status"), rs.getString("apartamento"));
                return veiculo;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar: " + e);
        }
        return null;
    }

    @Override
    public void bloquear(String placa) {
        PreparedStatement stmt;

        try {
            stmt = con.prepareStatement("UPDATE veiculo SET bloqueado = 1 WHERE placa = ?");
            stmt.setString(1, placa);
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao bloquear: " + e);
        }
    }

    @Override
    public void desbloquear(String placa) {
        PreparedStatement stmt;

        try {
            stmt = con.prepareStatement("UPDATE veiculo SET bloqueado = 0 WHERE placa = ?");
            stmt.setString(1, placa);
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao desbloquear: " + e);
        }
    }

    @Override
    public void entrada(Veiculo veiculo) {
        PreparedStatement stmt;
        ResultSet rs;
        int vagasDisponiveis;
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

            // CONSULTA APARTAMENTO NA TABELA DE APARTAMENTOS
            stmt = con.prepareStatement("SELECT * FROM apartamento WHERE numero = ?");
            stmt.setString(1, veiculo.getApartamento());
            rs = stmt.executeQuery();

            // ATUALIZA QUANTIDADE DE VAGAS DISPONIVEIS
            if (rs.next()) {
                stmt = con.prepareStatement("UPDATE apartamento SET vagasDisponiveis = ? WHERE numero = ?");
                vagasDisponiveis = rs.getInt("vagasDisponiveis");
                stmt.setInt(1, vagasDisponiveis - 1);
                stmt.setString(2, veiculo.getApartamento());
                stmt.executeUpdate();
            }

            JOptionPane.showMessageDialog(null, "Entrada realizada!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir entrada: " + e);
        }
    }

    @Override
    public void saida(Veiculo veiculo) {
        PreparedStatement stmt;
        ResultSet rs;
        Date date = new Date();
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sdt.format(date);
        int vagasDisponiveis;

        try {
            // UPDATE STATUS
            stmt = con.prepareStatement("UPDATE veiculo SET status = 0 WHERE placa = ?");
            stmt.setString(1, veiculo.getPlaca());
            stmt.executeUpdate();

            // INSERE SAÍDA NA TABELA ENTRADA_SAIDA
            stmt = con.prepareStatement("INSERT INTO entrada_saida (id_veiculo, momento, entrada_saida) VALUES (?,?,?)");
            stmt.setInt(1, veiculo.getId());
            stmt.setString(2, dateTime);
            stmt.setString(3, "Saída");
            stmt.executeUpdate();

            // CONSULTA APARTAMENTO NA TABELA DE APARTAMENTOS
            stmt = con.prepareStatement("SELECT * FROM apartamento WHERE numero = ?");
            stmt.setString(1, veiculo.getApartamento());
            rs = stmt.executeQuery();

            // ATUALIZA QUANTIDADE DE VAGAS DISPONIVEIS
            if (rs.next()) {
                stmt = con.prepareStatement("UPDATE apartamento SET vagasDisponiveis = ? WHERE numero = ?");
                vagasDisponiveis = rs.getInt("vagasDisponiveis");
                stmt.setInt(1, vagasDisponiveis + 1);
                stmt.setString(2, veiculo.getApartamento());
                stmt.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Saída realizada!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir saída: " + e);
        }
    }

    @Override
    public ResultSet listar() {
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

    @Override
    public void alterar(Veiculo veiculo) {
        PreparedStatement stmt;

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
        }
    }

    @Override
    public ResultSet entradaSaida() {
        PreparedStatement stmt;
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
