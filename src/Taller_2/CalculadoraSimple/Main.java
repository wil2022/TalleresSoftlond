package Taller_2.CalculadoraSimple;

//Crea una clase Calculadora que contenga métodos para realizar operaciones matemáticas básicas,
//como suma, resta, multiplicación y división.

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.suma(-50, 6));

        System.out.println(calculadora.resta(20, 9));

        System.out.println(calculadora.multip(8, 4));

        System.out.println(calculadora.division(25,2));

    }

}
