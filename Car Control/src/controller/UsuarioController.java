package controller;

import java.sql.ResultSet;
import model.Usuario;

public class UsuarioController {

    private Usuario user;

    public void cadastrar(String nome, String documento, String login, String senha, String cargo, String permissoes) {
        user = new Usuario(nome, documento, false, login, senha, cargo, permissoes);
        user.cadastrar(user);
    }

    public void alterar(int userId, String nome, String documento, boolean bloqueado, String login, String senha, String cargo, String permissoes) {
        user = new Usuario(userId, nome, documento, bloqueado, login, senha, cargo, permissoes);
        user.alterar(user);
    }
    
    public void alterarSenha(int id, String senha){
        user = new Usuario(id, senha);
        user.alterarSenha(id, senha);
    }

    public Usuario consultar(String login) {
        user = new Usuario(login);
        return user.consultar(user.getLogin());
    }

    public Usuario logar(String login, String senha) {
        user = new Usuario(login, senha);
        return user.logar(login, senha);
    }
    
    public ResultSet listar(){
        user = new Usuario();
        return user.listar();
    }
}
