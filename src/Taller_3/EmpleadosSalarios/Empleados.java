package Taller_3.EmpleadosSalarios;

abstract public class Empleados {

    private String nombre;
    private String tipoEmpleado;

    public Empleados(String nombre, String tipoEmpleado) {
        this.nombre = nombre;
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public abstract double calcularSalario();


}
