package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import classes.Usuario;
import conexao.Connect;

public class UsuarioDao {

    public void cadastrar(Usuario user) {

        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO usuario (nome, documento, login, senha, cargo, permissoes) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getDocumento());
            stmt.setString(3, user.getLogin());
            stmt.setString(4, user.getSenha());
            stmt.setString(5, user.getCargo());
            stmt.setString(6, user.getPermissoes());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e);
        } finally {
            Connect.closeConnection(con, stmt);
        }
    }

    public Usuario logar(String login, String senha) {

        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

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
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }
        return null;
    }

    public ResultSet listarUsuarios() {
        Connection con = Connect.getConnection();
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

    public Usuario consultarUsuario(String login) {
        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

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
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }
        return null;
    }

    public void alterarUsuario(Usuario user) {
        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;

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
        } finally {
            Connect.closeConnection(con, stmt);
        }
    }

    public void alterarSenha(int id, String senha) {
        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE usuario SET senha = ? WHERE id = ?");
            stmt.setString(1, senha);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar: " + e);
        } finally {
            Connect.closeConnection(con, stmt);
        }
    }
}
