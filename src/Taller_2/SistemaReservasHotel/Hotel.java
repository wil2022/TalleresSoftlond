package Taller_2.SistemaReservasHotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String nombre;
    private List<Habitacion> habitaciones;

    public Hotel(String nombre, int numeroHabitaciones) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
        for (int i = 1; i <= numeroHabitaciones; i++) {
            habitaciones.add(new Habitacion(i));
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public List<Habitacion> getHabitacionesDisponibles() {
        List<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getEstado().equals("Disponible")) {
                disponibles.add(habitacion);
            }
        }
        return disponibles;
    }

    public void realizarReserva(int numeroHabitacion) {
        Habitacion habitacion = habitaciones.get(numeroHabitacion - 1);
        habitacion.realizarReserva();

    }

    public void cancelarReserva(int numeroHabitacion) {
        Habitacion habitacion = habitaciones.get(numeroHabitacion - 1);
        habitacion.cancelarReserva();
    }

}
