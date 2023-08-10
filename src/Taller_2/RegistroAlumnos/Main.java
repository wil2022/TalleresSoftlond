package Taller_2.RegistroAlumnos;
//1. Registro de Alumnos:
//        Crea una clase Alumno con propiedades como nombre, edad y calificaciones.
//        Luego, crea una clase SistemaAlumnos que permite agregar alumnos,asignar calificaciones,
//        calcular el promedio de sus calificaciones y mostrar la información de cada alumno.

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList <Double> calificaciones = new ArrayList<>();

        calificaciones.add(3.4);
        calificaciones.add(2.9);
        calificaciones.add(4.1);
        calificaciones.add(4.9);

        ArrayList <Double> calificaciones2 = new ArrayList<>();

        calificaciones2.add(2.5);
        calificaciones2.add(3.6);
        calificaciones2.add(4.3);
        calificaciones2.add(2.9);

        SistemaAlumnos sistemaAlumnos = new SistemaAlumnos();

        Alumno alumno1 = new Alumno("Wilson Ramirez",25);
        Alumno alumno2 = new Alumno("Maria Gonzalez", 31);


        sistemaAlumnos.asignarCalificaciones(alumno1, calificaciones);

        sistemaAlumnos.asignarCalificaciones(alumno2, calificaciones2);

        sistemaAlumnos.agregarAlumno(alumno1);
        sistemaAlumnos.agregarAlumno(alumno2);

        sistemaAlumnos.imprimir();

    }

}
