package Taller_3.AnimalesSonidos;

public class Perro extends Animal{
    public Perro(String raza, String peso, String edad) {
        super(raza, peso, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println("guau guau");
    }
}
