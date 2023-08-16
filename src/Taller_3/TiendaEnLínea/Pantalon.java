package Taller_3.TiendaEnLínea;

public class Pantalon extends Ropa{

    public Pantalon(String marca, String genero, String material, String talla) {
        super(marca, genero, material, talla);
    }

    @Override
    public void cuidadoPrenda() {
        System.out.println("lavar a maquina max 30°C\nno usar secadora\nno limpiar en seco");
    }


    @Override
    public double calcularPrecio(double precioBase) {

        double descuento = precioBase * 10 / 100;
        double precioNeto = precioBase - descuento;

        return precioNeto;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca: " + getMarca() + "  Genero: " + getGenero() +
                            "  Material: " + getMaterial() + " Talla: " + getTalla());

    }
}
