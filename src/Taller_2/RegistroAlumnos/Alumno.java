package Taller_2.RegistroAlumnos;

//Crea una clase Alumno con propiedades como nombre, edad y calificaciones.

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private int edad;
    private ArrayList<Double> calificaciones;


    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }
}
