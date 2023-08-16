package Taller_3.AnimalesSonidos;

public class Animal {

    private String raza;
    private String peso;
    private String edad;

    public Animal(String raza, String peso, String edad) {
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
    }

    public void hacerSonido(){
        System.out.println("el animal esta haciendo un sonido");
    }

}
