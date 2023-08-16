package Taller_3.TiendaEnLínea;

public class Libro extends Libros{

    public Libro(String nombreLibro, String autor, String editorial, String numPaginas) {
        super(nombreLibro, autor, editorial, numPaginas);
    }

    @Override
    public double calcularPrecio(double precioBase) {

        double iva = precioBase * 19 / 100;

        double precioNeto = precioBase + iva;

        return precioNeto;

    }

    @Override
    public void mostrarDetalles() {

        System.out.println("Titulo: " + getNombreLibro() + "  Autor: " + getAutor() +
                        "  Editorial: " + getEditorial() + " Numero de Paginas: " + getNumPaginas());

    }
}
