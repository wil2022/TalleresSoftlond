package Taller_2.SistemaReservasHotel;

//        Crear un sistema de reservas de hotel que permita a los clientes corporativos reservar
//        múltiples habitaciones en diferentes hoteles para hospedar a su personal. Debes tener
//        clases como Hotel, Habitación, Cliente, y Reserva. Implementa métodos para listar
//        habitaciones disponibles, realizar reservas y cancelar reservas. Al final de la ejecución
//        del programa debe mostrar la siguiente info:
//
//        Nombre de la empresa que reservó
//        Nombre y cédula de quien ocupará cada habitación y número de la habitación que ocupará.
//        Esto para cada hotel.


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Reserva> reservas = new ArrayList<>();

        Hotel hotel1 = new Hotel("Decameron", 20);
        Hotel hotel2 = new Hotel("Dann Carlton", 30);
        Hotel hotel3 = new Hotel("Tequendama", 35);

        Cliente cliente1 = new Cliente("Softlond","Andres Perez","102938475");
        Cliente cliente2 = new Cliente("Globant","Andrea Ramirez","19364578");
        Cliente cliente3 = new Cliente("Seti","Juan Lopez","3445666787");


        Reserva reserva1 = new Reserva(cliente1,hotel1,9);
        Reserva reserva2 = new Reserva(cliente2,hotel2,12);
        Reserva reserva3 = new Reserva(cliente3,hotel3,15);


        reservas.add(reserva1);
        reservas.add(reserva2);
        reservas.add(reserva3);


        System.out.println("\nReservas\n");
        for (Reserva reserva: reservas) {
            for (Habitacion habitacion: reserva.getHotel().getHabitaciones()) {
                if(!habitacion.getEstado().equals("Disponible")){
                    System.out.println("Hotel: " + reserva.getHotel().getNombre() +
                                        "    Empresa: " + reserva.getCliente().getEmpresa() +
                                        "    Nombre: " + reserva.getCliente().getNombre() +
                                        "    Cedula: " + reserva.getCliente().getCedula() +
                                        "    Habitacion: " + reserva.getNumeroHabitacion());
                    break;
                }

            }

        }

    }

}
