package Taller_2.SistemaReservasHotel;


public class Habitacion {
    private int numHab;
    private String estado;

    public Habitacion(int numHab) {
        this.numHab = numHab;
        this.estado = "Disponible";
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumHab() {
        return numHab;
    }

    public String getEstado() {
        return estado;
    }

    public void realizarReserva() {
        this.estado = "Reservado";
    }

    public void cancelarReserva() {
        this.estado = "Disponible";
    }

}
