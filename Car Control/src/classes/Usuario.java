package classes;

public class Usuario extends Pessoa {
	private String login;
	private String senha;
	private String cargo;
	private String permissoes;

	public Usuario(String nome, String documento, String login, String senha, String cargo, String permissoes) {
		this.login = login;
		this.senha = senha;
		this.cargo = cargo;
		this.permissoes = permissoes;
		setNome(nome);
		setDocumento(documento);
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

	public void setPermissoes(String permissoes) {
		this.permissoes = permissoes;
	}

}
