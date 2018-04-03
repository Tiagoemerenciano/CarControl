package classes;

public class Veiculo extends Controle {

    private int id;
    private String placa;
    private String modelo;
    private String tipo;
    private String cor;

    public Veiculo(String placa, String modelo, String tipo, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.cor = cor;
    }

    public Veiculo(String placa, String modelo, String tipo, String cor, boolean bloqueado, boolean status) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.cor = cor;
        setStatus(status);
        setBloqueado(bloqueado);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
