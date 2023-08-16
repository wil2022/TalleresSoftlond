package Taller_3.EmpleadosSalarios;

public class Asalariado extends Empleados{

   private double salarioBase;


    public Asalariado(String nombre, String tipoEmpleado, double salarioBase) {
        super(nombre, tipoEmpleado);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {

        double deducciones = salarioBase * 0.08;
        double auxTransporte = 140606;
        double salarioNeto = 0;

        if(salarioBase > 2320000){
            salarioNeto = salarioBase - deducciones;
        }else {
            salarioNeto = salarioBase + auxTransporte - deducciones;
        }

        return salarioNeto;

    }
}
