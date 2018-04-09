package dao;

import model.Apartamento;

public interface ApartamentoDao {

    public void cadastrar(Apartamento apto);

    public Apartamento consultar(String numero);
}
