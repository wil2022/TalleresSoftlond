package Taller_3.JuegoCartas;

public class CartaPoker extends Carta implements ICarta{
    public CartaPoker(String pinta, String valor) {
        super(pinta, valor);
    }

    @Override
    public void mostrarCarta() {

        System.out.println(getValor() + " de " + getPinta());

    }

    @Override
    public int valorNumerico() {
        return 0;
    }

}
