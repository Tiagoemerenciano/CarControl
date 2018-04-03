package classes;

import javax.swing.JCheckBox;

public class Usuario extends Pessoa {

    private String login;
    private String senha;
    private String cargo;
    private String permissoes;
    private boolean bloqueado;

    public Usuario() {
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

}
