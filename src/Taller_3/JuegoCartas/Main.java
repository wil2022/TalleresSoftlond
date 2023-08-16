package Taller_3.JuegoCartas;
/*
Crea un juego de cartas en el que puedas representar diferentes tipos de cartas
(por ejemplo, cartas de póker) utilizando una jerarquía de clases y una interfaz.
La interfaz podría definir métodos como mostrarCarta y valorNumerico. Luego, implementa
clases para los diferentes tipos de cartas y para la baraja.

 */

public class Main {

    public static void main(String[] args) {
        BarajaPoker barajaPoker = new BarajaPoker();
        barajaPoker.mostrarBaraja();
        System.out.println();
        BarajaUno barajaUno = new BarajaUno();
        barajaUno.mostrarBaraja();

    }
}
