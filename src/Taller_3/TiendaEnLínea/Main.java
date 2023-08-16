package Taller_3.TiendaEnLínea;
/*
Construye un sistema básico para una tienda en línea. Crea una interfaz
para representar productos y métodos como calcularPrecio y mostrarDetalles.
Luego, implementa clases abstractas para diferentes categorías de productos
(electrónica, ropa, libros, etc.) y clases concretas para productos específicos
en cada categoría.
 */

public class Main {

    public static void main(String[] args) {

    Electronica tv1 = new Televisor("Tv","Samsung","110","WiFi");
    Ropa pantalon1 = new Pantalon("Levis","Hombre","algodon","M");
    Libros libro1 = new Libro("MobyDick","Herman Melville","Panamericana","570");


    tv1.mostrarDetalles();
    System.out.println("el precio del televisor es: " + tv1.calcularPrecio(1500000));
    System.out.println("costo de garantia extendida: " + tv1.garantiaExtendida(3));
    System.out.println();
    pantalon1.mostrarDetalles();
    System.out.println("el precio del pantalon es: " + pantalon1.calcularPrecio(120000));
    pantalon1.cuidadoPrenda();
    System.out.println();
    libro1.mostrarDetalles();
    System.out.println("el precio del libro es: " + libro1.calcularPrecio(50000));

    }


}
