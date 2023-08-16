package Taller_3.FigurasEnUnLienzo;

public class Rectangulos extends Figura{

    public Rectangulos(String nombre, String numLados) {
        super(nombre, numLados);
    }

    @Override
    public void dibujar() {
        System.out.println("\nDibujando un rectangulo");
        System.out.println("__________________");
        System.out.println("|                |");
        System.out.println("|                |");
        System.out.println("|                |");
        System.out.println("------------------");

    }

}
