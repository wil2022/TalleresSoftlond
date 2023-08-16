package Taller_3.FigurasGeometricas;

//        Crea una jerarquía de clases que representan diferentes figuras geométricas, como círculos,
//        triángulos y cuadrados. Utiliza una interfaz para definir métodos comunes como cálculo
//        de área y perímetro. Cada figura debe tener su propia implementación de estos métodos.

public class Main {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo("circulo1",0,3.5);
        Cuadrado cuadrado1 = new Cuadrado("cuadrado1",4,3);
        Triangulo triangulo1 = new Triangulo("triangulo1",3, 4, 6, 9);


        circulo1.calcularArea();
        circulo1.calcularPerimetro();

        cuadrado1.calcularArea();
        cuadrado1.calcularPerimetro();

        triangulo1.calcularArea();
        triangulo1.calcularPerimetro();



    }
}
