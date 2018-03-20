package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import classes.Usuario;
import conexao.Connect;

public class LoginDao {
	public void cadastrar(Usuario user) {

		Connection con = Connect.getConnection();
		PreparedStatement stmt = null;

		try {
			stmt = con
					.prepareStatement("INSERT INTO usuario (nome, documento, login, senha, cargo) VALUES (?,?,?,?,?)");
			stmt.setString(1, user.getNome());
			stmt.setString(2, user.getDocumento());
			stmt.setString(3, user.getLogin());
			stmt.setString(4, user.getSenha());
			stmt.setString(5, user.getCargo());
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e);
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
				Usuario user = new Usuario(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7));
				return user;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao logar: " + e);
		} finally {
			Connect.closeConnection(con, stmt, rs);
		}
		return null;
	}
}
