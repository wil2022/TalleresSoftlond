package Taller_3.BancoCuentas;

abstract public class Cuentas implements ICuentasBancarias{

    private String titular;
    private String documento;
    private String numCuenta;
    private double saldo;


    public Cuentas(String titular, String documento, String numCuenta, double saldo) {
        this.titular = titular;
        this.documento = documento;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }
    public abstract void extractoCuenta();

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    public double getSaldo() {
        return Math.round(saldo * 100.0) / 100.0;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
