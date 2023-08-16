package Taller_3.BancoCuentas;


public class CuentasAhorros extends Cuentas{

    public CuentasAhorros(String titular, String documento, String numCuenta, double saldo) {
        super(titular, documento, numCuenta, saldo);
    }

    @Override
    public void extractoCuenta() {
        System.out.println("Titular: " + getTitular() + " Documento: " + getDocumento() +
                            " Numero de Cuenta: " + getNumCuenta() + " Saldo: $ " + getSaldo());
    }

    @Override
    public void depositarDinero(double cantidadDeposito) {

        setSaldo(getSaldo() + cantidadDeposito);
        System.out.println("Ha depositado $ " + cantidadDeposito + " en la cuenta\n" +
                            "saldo total $ " + getSaldo());

    }

    @Override
    public void retirarDinero(double cantidadRetiro) {

        if(cantidadRetiro > getSaldo()){
            System.out.println("no tiene saldo suficiente en la cuenta");
        }else{
            double cuatroXMil = cantidadRetiro * 4 / 1000;
            setSaldo(getSaldo() - cantidadRetiro - cuatroXMil);
            System.out.println("Ha hecho un retiro por $ " + cantidadRetiro + "\n" +
                                "saldo total: $ " + getSaldo());
        }

    }

}
