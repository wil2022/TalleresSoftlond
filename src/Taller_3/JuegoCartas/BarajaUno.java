package Taller_3.JuegoCartas;

import java.util.ArrayList;
import java.util.List;

public class BarajaUno {

    public List<ICarta> cartasUno = new ArrayList<>();

    public BarajaUno(){

        String[] valoresUno = {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "Saltar", "Reversa", "Cambio de Color"};
        String[] coloresUno = {"Rojo", "Azul", "Verde", "Amarillo"};

        for (String color : coloresUno) {
            for (String valor : valoresUno) {
                cartasUno.add(new CartasUno(color, valor));
            }
        }
    }

    public void mostrarBaraja() {
        System.out.println("Baraja Cartas UNO");
        for (ICarta carta : cartasUno) {
            carta.mostrarCarta();
        }
    }

}



