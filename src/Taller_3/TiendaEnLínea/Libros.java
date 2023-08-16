package Taller_3.TiendaEnLínea;

abstract public class Libros implements IProductos{

    private String nombreLibro;
    private String autor;
    private String editorial;
    private String numPaginas;

    public Libros(String nombreLibro, String autor, String editorial, String numPaginas) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
    }


    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }
}
