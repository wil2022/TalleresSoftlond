package Taller_3.JuegoCartas;

import java.util.ArrayList;
import java.util.List;

public class BarajaPoker {

    public List<ICarta> cartasPoker = new ArrayList<>();

    public BarajaPoker() {
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String palo : palos) {
            for (String valor : valores) {
                cartasPoker.add(new CartaPoker(palo, valor));
            }
        }
    }

    public void mostrarBaraja() {
        System.out.println("Baraja cartas Poker");
        for (ICarta carta : cartasPoker) {
            carta.mostrarCarta();
        }
    }
}
