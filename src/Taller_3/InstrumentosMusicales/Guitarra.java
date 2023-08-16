package Taller_3.InstrumentosMusicales;

public class Guitarra extends InstrumentoMusical {

    public Guitarra(String tipo, String marca) {
        super(tipo, marca);
    }

    @Override
    public void tocar(){
        System.out.println("la guitarra suena: trin trin");
    }

}
