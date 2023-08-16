package Taller_3.InstrumentosMusicales;

public class Violin extends InstrumentoMusical {

    public Violin(String tipo, String marca) {
        super(tipo, marca);
    }

    @Override
    public void tocar(){
        System.out.println("el violin suena: sing sing");
    }
}
