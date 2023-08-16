package Taller_3.BancoCuentas;

public class CuentasCorrientes extends Cuentas {


    public CuentasCorrientes(String titular, String documento, String numCuenta, double saldo) {
        super(titular, documento, numCuenta, saldo);
    }

    @Override
    public void extractoCuenta() {
        System.out.println("\nExtracto Cuenta Corriente\n" + "Titular: " + getTitular() +
                            " Numero de Cuenta: " + getNumCuenta() + " Saldo $ " + getSaldo());
    }

    @Override
    public void depositarDinero(double cantidadDeposito) {
        setSaldo(getSaldo() + cantidadDeposito);
        System.out.println("Cantidad depositada en la cuenta: $" + cantidadDeposito);
    }

    @Override
    public void retirarDinero(double cantidadRetiro) {

        if (cantidadRetiro < getSaldo()) {
            setSaldo(getSaldo() - cantidadRetiro);
            System.out.println("Realizo un retiro de su cuenta por $" + cantidadRetiro);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
