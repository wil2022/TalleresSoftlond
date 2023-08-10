package Taller_2.CalculadoraSimple;

public class Calculadora {

    public int suma(int a, int b){

        return a + b;
    }

    public int resta(int a, int b){

        return a - b;
    }

    public int multip (int a, int b){
        return a * b;
    }

    public double division(double a, double b) {

     if(b == 0) {
         throw new ArithmeticException("no se puede dividir entre cero");
     }else {
         return a / b;
     }

    }

}


