package model;

import dao.UsuarioDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import static view.MainFrame.con;

public class Usuario extends Pessoa implements UsuarioDao {

    private String login;
    private String senha;
    private String cargo;
    private String permissoes;
    private boolean bloqueado;

    public Usuario() {
    }

    public Usuario(int id, String senha) {
        this.senha = senha;
        setId(id);
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Usuario(String login) {
        this.login = login;
    }

    public Usuario(int id, String nome, String documento, boolean bloqueado, String login, String senha, String cargo, String permissoes) {
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
        this.permissoes = permissoes;
        setNome(nome);
        setDocumento(documento);
        setId(id);
        setBloqueado(bloqueado);
    }

    public Usuario(String nome, String documento, boolean bloqueado, String login, String senha, String cargo, String permissoes) {
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
        this.permissoes = permissoes;
        setNome(nome);
        setDocumento(documento);
        setBloqueado(bloqueado);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPermissoes() {
        return permissoes;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public String setPermissoes(JCheckBox cbAlterarApartamento, JCheckBox cbAlterarPedestre, JCheckBox cbAlterarUsuario, JCheckBox cbAlterarVeiculo,
            JCheckBox cbBloquearPedestre, JCheckBox cbBloquearUsuario, JCheckBox cbBloquearVeiculo, JCheckBox cbCadastrarApartamento,
            JCheckBox cbCadastrarPedestre, JCheckBox cbCadastrarUsuario, JCheckBox cbCadastrarVeiculo, JCheckBox cbConsultarApartamento,
            JCheckBox cbConsultarPedestre, JCheckBox cbConsultarVeiculo, JCheckBox cbEntradaPedestre, JCheckBox cbEntradaSaidaVeiculo,
            JCheckBox cbHistoricoPedestre, JCheckBox cbHistoricoVeiculo) {
        String perm = "";

        if (cbCadastrarVeiculo.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbEntradaSaidaVeiculo.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbConsultarVeiculo.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbAlterarVeiculo.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbHistoricoVeiculo.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbBloquearVeiculo.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbCadastrarPedestre.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbEntradaPedestre.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbConsultarPedestre.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbAlterarPedestre.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbHistoricoPedestre.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbBloquearPedestre.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbCadastrarApartamento.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbConsultarApartamento.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbAlterarApartamento.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbCadastrarUsuario.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbAlterarUsuario.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        if (cbBloquearUsuario.isSelected()) {
            perm += "1";
        } else {
            perm += "0";
        }

        return perm;
    }

    @Override
    public void cadastrar(Usuario user) {
        PreparedStatement stmt;

        try {
            stmt = con.prepareStatement("INSERT INTO usuario (nome, documento, login, senha, cargo, permissoes, bloqueado) VALUES (?,?,?,?,?,?,?)");
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getDocumento());
            stmt.setString(3, user.getLogin());
            stmt.setString(4, user.getSenha());
            stmt.setString(5, user.getCargo());
            stmt.setString(6, user.getPermissoes());
            stmt.setBoolean(7, user.isBloqueado());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e);
        }
    }

    @Override
    public Usuario logar(String login, String senha) {
        PreparedStatement stmt;
        ResultSet rs;

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ? AND senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                Usuario user = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("documento"), rs.getBoolean("bloqueado"), rs.getString("login"), rs.getString("senha"),
                        rs.getString("cargo"), rs.getString("permissoes"));
                return user;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao logar: " + e);
        }
        return null;
    }

    @Override
    public ResultSet listar() {
        PreparedStatement stmt;
        ResultSet rs;

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar usuários: " + e);
        }
        return null;
    }

    @Override
    public Usuario consultar(String login) {
        PreparedStatement stmt;
        ResultSet rs;

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ?");
            stmt.setString(1, login);
            rs = stmt.executeQuery();
            if (rs.next()) {
                Usuario user = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("documento"), rs.getBoolean("bloqueado"), rs.getString("login"), rs.getString("senha"),
                        rs.getString("cargo"), rs.getString("permissoes"));
                return user;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar dados: " + e);
        }
        return null;
    }

    @Override
    public void alterar(Usuario user) {
        PreparedStatement stmt;

        try {
            stmt = con.prepareStatement("UPDATE usuario SET nome = ?, documento = ?, bloqueado = ?, login = ?, senha = ?, cargo = ?, permissoes = ? WHERE id = ?");
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getDocumento());
            stmt.setBoolean(3, user.isBloqueado());
            stmt.setString(4, user.getLogin());
            stmt.setString(5, user.getSenha());
            stmt.setString(6, user.getCargo());
            stmt.setString(7, user.getPermissoes());
            stmt.setInt(8, user.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar: " + e);
        }
    }

    @Override
    public void alterarSenha(int id, String senha) {
        PreparedStatement stmt;

        try {
            stmt = con.prepareStatement("UPDATE usuario SET senha = ? WHERE id = ?");
            stmt.setString(1, senha);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar: " + e);
        }
    }

}
