package Taller_3.TiendaEnLínea;

abstract public class Electronica implements IProductos{

    private String categoria;
    private String marca;
    private String voltaje;
    private String conectividad;


    public Electronica(String categoria, String marca, String voltaje, String conectividad) {
        this.categoria = categoria;
        this.marca = marca;
        this.voltaje = voltaje;
        this.conectividad = conectividad;
    }

    public abstract int garantiaExtendida(int años);


    public String getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getVoltaje() {
        return voltaje;
    }

    public String getConectividad() {
        return conectividad;
    }

}
