package Taller_3.InstrumentosMusicales;

import java.util.ArrayList;

/*
Diseña una jerarquía de clases para instrumentos musicales, como guitarras,
pianos y violines. Cada instrumento debe tener un método tocar() que imprima
cómo suena. Luego, crea un método que acepte un arreglo de instrumentos y los
haga tocar a todos utilizando polimorfismo.

 */
public class Main {

    public static void tocarInstrumentos(ArrayList<InstrumentoMusical> instrumentos){

        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.tocar();
        }
    }

    public static void main(String[] args) {

   ArrayList<InstrumentoMusical> instrumentos = new ArrayList<>();

   InstrumentoMusical guitarra1 = new Guitarra("cuerda","Fender");
   InstrumentoMusical piano1 = new Piano("percusion","Kawai");
   InstrumentoMusical violin1 = new Violin("cuerda","Stradivarius");

   instrumentos.add(guitarra1);
   instrumentos.add(piano1);
   instrumentos.add(violin1);

   tocarInstrumentos(instrumentos);

    }

}
