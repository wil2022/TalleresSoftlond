package Taller_3.FigurasEnUnLienzo;
/*
Crea una interfaz llamada Dibujable que tenga un método dibujar()
y una clase abstracta Figura que implemente esta interfaz. Luego,
implementa diferentes clases de figuras (círculos, rectángulos, etc.)
que extiendan la clase Figura. Crea una clase Lienzo que tenga un arreglo
de objetos Dibujable y, utilizando polimorfismo, llama al método dibujar()
en cada objeto.

 */
public class Main {
    public static void main(String[] args) {

        Dibujable circulo = new Circulos("circulo","0");
        Dibujable rectangulo = new Rectangulos("rectangulo","4");

        Lienzo.lienzo.add(circulo);
        Lienzo.lienzo.add(rectangulo);

        for (Dibujable figura: Lienzo.lienzo) {
            figura.dibujar();
        }

    }

}
