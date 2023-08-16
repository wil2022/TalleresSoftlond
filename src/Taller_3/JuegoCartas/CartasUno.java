package Taller_3.JuegoCartas;

public class CartasUno extends Carta implements ICarta{


    public CartasUno(String pinta, String valor) {
        super(pinta, valor);
    }

    @Override
    public void mostrarCarta() {
        System.out.println(getValor() + " de color " + getPinta());
    }

    @Override
    public int valorNumerico() {
        return 0;
    }

}
