package Taller_3.FigurasEnUnLienzo;

abstract public class Figura implements Dibujable {

    private String nombre;
    private String numLados;

    public Figura(String nombre, String numLados) {
        this.nombre = nombre;
        this.numLados = numLados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumLados() {
        return numLados;
    }
}
