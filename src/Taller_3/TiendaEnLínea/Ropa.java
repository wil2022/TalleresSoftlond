package Taller_3.TiendaEnLínea;

abstract public class Ropa implements IProductos{

   private String marca;
   private String genero;
   private String material;
   private String talla;

    public Ropa(String marca, String genero, String material, String talla) {
        this.marca = marca;
        this.genero = genero;
        this.material = material;
        this.talla = talla;
    }

    public abstract void cuidadoPrenda();

    public String getMarca() {
        return marca;
    }

    public String getGenero() {
        return genero;
    }

    public String getMaterial() {
        return material;
    }

    public String getTalla() {
        return talla;
    }
}
