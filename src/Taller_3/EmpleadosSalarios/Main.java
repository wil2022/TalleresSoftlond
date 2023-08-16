package Taller_3.EmpleadosSalarios;

import java.util.ArrayList;
import java.util.List;

/*
Crea una jerarquía de clases para representar diferentes tipos de empleados,
como asalariados y por horas. Cada clase debe tener un método para calcular
el salario. Utiliza el polimorfismo para calcular el salario de diferentes
tipos de empleados en un array.
 */
public class Main {

    public static void main(String[] args) {

        List<Empleados> empleados = new ArrayList<>();

        Empleados empleado1 = new Asalariado("Pedro","Asalariado",1500000);
        Empleados empleado2 = new PorHoras("Juliana","Por horas",6000,180);

        empleados.add(empleado1);
        empleados.add(empleado2);

        for (Empleados empleado : empleados) {
            System.out.println("el salario del empleado: " + empleado.getNombre() +
                  " tipo: " + empleado.getTipoEmpleado() + " es: " + empleado.calcularSalario());
        }

    }


}
