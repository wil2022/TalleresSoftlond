package Taller_3.InstrumentosMusicales;

public class InstrumentoMusical {

    private String tipo;
    private String marca;

    public InstrumentoMusical(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public void tocar(){
        System.out.println("al tocar un instrumento emite un sonido");
    }

}
