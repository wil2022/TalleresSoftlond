package Taller_3.FormasGeométricasAreas;

public class Cuadrado extends FormaGeometrica implements IForma {

    private double longLado;

    public Cuadrado(String nombre, int lados, double longLado) {
        super(nombre, lados);
        this.longLado = longLado;
    }

    @Override
    public void calcularArea() {

        double area = longLado * longLado;
        System.out.println("el area del cuadrado es: " + area);

    }

    @Override
    public void calcularPerimetro() {

        double perim = 4 * longLado;
        System.out.println("el perimetro del cuadrado es: " + perim);

    }
}
