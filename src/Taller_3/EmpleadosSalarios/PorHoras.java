package Taller_3.EmpleadosSalarios;

public class PorHoras extends Empleados{

    private double salarioPorHora;
    private double horasTrabajadas;

    public PorHoras(String nombre, String tipoEmpleado, double salarioPorHora, double horasTrabajadas) {
        super(nombre, tipoEmpleado);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {

        double salarioNeto = salarioPorHora * horasTrabajadas;

        return  salarioNeto;

    }
}
