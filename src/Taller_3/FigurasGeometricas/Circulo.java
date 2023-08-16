package Taller_3.FigurasGeometricas;

public class Circulo extends FiguraGeometrica implements  IAreaPerimetro{

    private double radio;

    public Circulo(String nombre, int lados, double radio) {
        super(nombre, lados);
        this.radio = radio;
    }


    @Override
    public void calcularArea() {

        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("el area del circulo es: " + Math.round(area * 100.0) / 100.0);

    }

    @Override
    public void calcularPerimetro() {

        double perim = 2 * Math.PI * radio;
        System.out.println("el perimetro del circulo es: " + Math.round(perim * 100.0) / 100.0);

    }

}
