package Taller_2.RegistroAlumnos;

import java.util.ArrayList;

//        Luego, crea una clase SistemaAlumnos que permite agregar alumnos,asignar calificaciones ,
//        calcular el promedio de sus calificaciones y mostrar la información de cada alumno.

public class SistemaAlumnos {

    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    public void asignarCalificaciones(Alumno alumno, ArrayList<Double> calificaciones){

        alumno.setCalificaciones(calificaciones);

    }

    public Double promedioCalificaciones(Alumno alumno){

        double suma = 0;
        double promedio;

        for (double n : alumno.getCalificaciones()) {
            suma += n;
        }

        promedio = (suma / alumno.getCalificaciones().size());


        return Math.round(promedio * 100.0) / 100.0;

    }

    public void imprimir(){
        System.out.println("Alumnos\n");
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombre() + "  Edad: " + alumno.getEdad() +
                    "   Calificiaciones: " + alumno.getCalificaciones() + "     Promedio: " + promedioCalificaciones(alumno) + "\n");
        }
    }



}
