package Taller_3.JuegoCartas;

public class Carta{

    private String pinta;
    private String valor;

    public Carta(String pinta, String valor) {
        this.pinta = pinta;
        this.valor = valor;
    }

    public String getPinta() {
        return pinta;
    }

    public void setPinta(String pinta) {
        this.pinta = pinta;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
