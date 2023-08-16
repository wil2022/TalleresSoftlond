package Taller_3.FigurasEnUnLienzo;

public class Circulos extends Figura{

    public Circulos(String nombre, String numLados) {
        super(nombre, numLados);
    }

    @Override
    public void dibujar() {
        System.out.println("\nDibujando un circulo");
        System.out.println("     *       ");
        System.out.println("  *     *    ");
        System.out.println(" *       *   ");
        System.out.println("  *     *    ");
        System.out.println("     *       ");

    }
}
