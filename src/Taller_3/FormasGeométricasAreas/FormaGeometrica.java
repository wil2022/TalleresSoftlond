package Taller_3.FormasGeométricasAreas;

abstract public class FormaGeometrica {

    private String nombre;
    private int lados;

    public FormaGeometrica(String nombre, int lados) {
        this.nombre = nombre;
        this.lados = lados;
    }

    public String getNombre() {
        return nombre;
    }
}
