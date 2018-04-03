package classes;

public class Apartamento {

    private int id;
    private String numero;
    private int qtdVagas;
    private int qtdVeiculos;

    public Apartamento(int qtdVeiculos, int qtdVagas) {
        this.qtdVeiculos = qtdVeiculos;
        this.qtdVagas = qtdVagas;
    }

    public Apartamento(String numero, int qtdVeiculos, int qtdVagas) {
        this.numero = numero;
        this.qtdVeiculos = qtdVeiculos;
        this.qtdVagas = qtdVagas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public int getQtdVeiculos() {
        return qtdVeiculos;
    }

    public void setQtdVeiculos(int qtdVeiculos) {
        this.qtdVeiculos = qtdVeiculos;
    }

    public String getqtdVagas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
