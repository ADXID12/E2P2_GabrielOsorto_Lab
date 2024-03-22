package e2p2_gabrielosorto_lab;

public class Carro {

    private String marca, modelo;
    private int veocidad;

    public Carro() {
    }

    public Carro(String marca, String modelo, int veocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.veocidad = veocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVeocidad() {
        return veocidad;
    }

    public void setVeocidad(int veocidad) {
        this.veocidad = veocidad;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", veocidad=" + veocidad + '}';
    }

}
