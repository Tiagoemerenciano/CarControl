package dao;

import model.Veiculo;
import java.sql.ResultSet;

public interface VeiculoDao {

    public void cadastrar(Veiculo veiculo);

    public Veiculo consultar(String placa);

    public void bloquear(String placa);

    public void desbloquear(String placa);

    public void entrada(Veiculo veiculo);

    public void saida(Veiculo veiculo);

    public ResultSet listar();

    public void alterar(Veiculo veiculo);
    
    public ResultSet entradaSaida ();
    
}
