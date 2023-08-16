package Taller_3.FormasGeométricasAreas;

import java.util.ArrayList;
import java.util.List;

/*
Utiliza la jerarquía de clases de formas geométricas que creaste en el ejercicio
anterior (con interfaces y clases abstractas). Agrega un método calcularArea() a la
interfaz de las formas y luego implementa este método en las clases concretas.
Crea un array de formas y calcula el área de cada una utilizando polimorfismo.

 */
public class Main {

    public static void main(String[] args) {

        List<IForma> formas = new ArrayList<>();
        
        IForma circulo1 = new Circulo("circulo1",0,2.5);
        IForma cuadrado1 = new Cuadrado("cuadrado1",4,6);
        IForma triangulo1 = new Triangulo("triangulo1",3,5.5,7,4.1);

        formas.add(circulo1);
        formas.add(cuadrado1);
        formas.add(triangulo1);

        for (IForma forma : formas) {
            forma.calcularArea();
            
        }
        
    }

}
