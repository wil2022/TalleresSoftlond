package Taller_2.SistemaReservasHotel;

public class Reserva {

        private Cliente cliente;
        private Hotel hotel;
        private int numeroHabitacion;

        public Reserva(Cliente cliente, Hotel hotel, int numeroHabitacion) {
            this.cliente = cliente;
            this.hotel = hotel;
            this.numeroHabitacion = numeroHabitacion;
            hotel.realizarReserva(numeroHabitacion);

        }


    public Cliente getCliente() {
        return cliente;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void cancelarReserva() {
            hotel.cancelarReserva(numeroHabitacion);
        }

    }


