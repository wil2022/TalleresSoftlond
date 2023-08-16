package Taller_3.FormasGeométricasAreas;

public class Triangulo extends FormaGeometrica implements IForma {

    private double ladoA;
    private double ladoB;
    private double ladoC;


    public Triangulo(String nombre, int lados, double ladoA, double ladoB, double ladoC) {
        super(nombre, lados);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public void calcularArea() {

        double s = (ladoA + ladoB + ladoC)/2;

        double area = Math.sqrt(s*(s - ladoA)*(s - ladoB)*(s - ladoC));

        double roundArea = Math.round(area*100.0)/100.0;

        System.out.println("El area del triangulo es: " + roundArea);


    }

    @Override
    public void calcularPerimetro() {

        double perim = ladoA + ladoB + ladoC;

        System.out.println("el perimetro del triangulo es: " + perim);

    }


}
