package Taller_3.AnimalesSonidos;

public class Pajaro extends Animal{

    public Pajaro(String raza, String peso, String edad) {
        super(raza, peso, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println("twit twit");
    }

}
