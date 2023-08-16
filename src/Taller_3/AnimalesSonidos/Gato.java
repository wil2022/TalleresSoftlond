package Taller_3.AnimalesSonidos;

public class Gato extends Animal{

    public Gato(String raza, String peso, String edad) {
        super(raza, peso, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println("miau miau");
    }
}
