package controller;

import model.Apartamento;

public class ApartamentoController {
    public void cadastrar(String numero, int qtdVagas){
        Apartamento apto = new Apartamento(numero, qtdVagas, 0);
        apto.cadastrar(apto);
    }
    
    public Apartamento consultar(String numero){
        Apartamento apto = new Apartamento(numero);
        return apto.consultar(numero);
    }
}