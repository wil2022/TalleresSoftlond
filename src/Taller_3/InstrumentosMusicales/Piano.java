package Taller_3.InstrumentosMusicales;

public class Piano extends InstrumentoMusical {

    public Piano(String tipo, String marca) {
        super(tipo, marca);
    }

    @Override
    public void tocar(){
        System.out.println("el piano suena: plin plin");
    }

}
