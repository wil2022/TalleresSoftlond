package Taller_3.AnimalesSonidos;
/*
Crea una jerarquía de clases que representen diferentes tipos de animales,
como perros, gatos y pájaros. Cada clase de animal debe tener un método hacerSonido()
que imprima el sonido característico del animal. Luego, crea un array de animales y
recorre el array llamando al método hacerSonido() en cada uno. Esto demuestra cómo el
polimorfismo permite tratar objetos de diferentes clases de manera uniforme.

 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        Animal perro1 = new Perro("pastor aleman","15","8");
        Animal gato1 = new Gato("angora","6","4");
        Animal pajaro1 = new Pajaro("Canario Roller","2","3");

        animales.add(perro1);
        animales.add(gato1);
        animales.add(pajaro1);

        for (Animal animal : animales) {
            animal.hacerSonido();
        }

    }


}
