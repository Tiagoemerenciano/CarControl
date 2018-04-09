package dao;

import java.sql.ResultSet;

import model.Usuario;

public interface UsuarioDao{

    public void cadastrar(Usuario user);

    public Usuario logar(String login, String senha);

    public ResultSet listar();

    public Usuario consultar(String login);

    public void alterar(Usuario user);

    public void alterarSenha(int id, String senha);
}
