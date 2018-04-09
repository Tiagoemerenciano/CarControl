package controller;

import java.sql.ResultSet;
import model.Veiculo;

public class VeiculoController {

    public void cadastrar(String placa, String modelo, String tipo, String cor, String apartamento) {
        Veiculo veiculo = new Veiculo(placa, modelo, tipo, cor, apartamento);
        veiculo.cadastrar(veiculo);
    }

    public Veiculo consultar(String placa) {
        Veiculo veiculo = new Veiculo(placa);
        return veiculo.consultar(placa);
    }

    public void bloquear(String placa) {
        Veiculo veiculo = new Veiculo(placa);
        veiculo.bloquear(placa);
    }

    public void desbloquear(String placa) {
        Veiculo veiculo = new Veiculo(placa);
        veiculo.desbloquear(placa);
    }

    public void entrada(Veiculo veiculo) {
        veiculo.entrada(veiculo);
    }

    public void saida(Veiculo veiculo) {
        veiculo.saida(veiculo);
    }
    
    public ResultSet listar(){
        Veiculo veiculo = new Veiculo();
        return veiculo.listar();
    }
    
    public void alterar(String placa, String modelo, String tipo, String cor, boolean bloqueado){
        Veiculo veiculo = new Veiculo(placa, modelo, tipo, cor, bloqueado);
        veiculo.alterar(veiculo);
    }
    
    public ResultSet entradaSaida(){
        Veiculo veiculo = new Veiculo();
        return veiculo.entradaSaida();
    }
}
