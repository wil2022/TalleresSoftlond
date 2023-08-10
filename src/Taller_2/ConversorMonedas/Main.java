package Taller_2.ConversorMonedas;

//Crea una clase ConversorMonedas que contenga métodos para convertir una cantidad de
//dinero de una moneda a otra, por ejemplo, de dólares a euros o de pesos a dólares.

public class Main {

    public static void main(String[] args) {

        ConversorMonedas conversorMonedas = new ConversorMonedas();

        conversorMonedas.dolaresAEuros(100);
        conversorMonedas.pesosADolares(10000);
        conversorMonedas.eurosADolares(20);
        conversorMonedas.pesosAEuros(200000);
    }


}
