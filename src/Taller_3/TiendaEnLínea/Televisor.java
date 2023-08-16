package Taller_3.TiendaEnLínea;

public class Televisor extends Electronica{

    public Televisor(String categoria, String marca, String voltaje, String conectividad) {
        super(categoria, marca, voltaje, conectividad);
    }

    @Override
    public int garantiaExtendida(int años) {

        int costoGarantia = 0;
        switch (años) {
            case 1:
                costoGarantia = 210000;
            break;
            case 2:
                costoGarantia = 350000;
            break;
            case 3:
                costoGarantia = 513000;
            break;
            case 4:
                costoGarantia = 760000;
            break;
            default:
                costoGarantia = -1;

        }

        return costoGarantia;
    }

    @Override
    public double calcularPrecio(double precioBase) {

        double iva = precioBase * 19 / 100;
        double descuento = precioBase * 15 / 100;

        double precioNeto = precioBase + iva - descuento;

        return precioNeto;
    }

    @Override
    public void mostrarDetalles() {

        System.out.println("Categoria: " + getCategoria() + " Marca: " + getMarca() +
                            " Voltaje: " + getVoltaje() + " Conectividad: " + getConectividad());

    }
}
