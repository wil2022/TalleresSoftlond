package Taller_3.BancoCuentas;

/*
Desarrolla un sistema bancario que incluya una interfaz para representar cuentas bancarias y
métodos para depositar y retirar dinero. Crea una clase abstracta que implemente parte de la
lógica común de las cuentas, y luego implementa clases concretas para diferentes tipos de cuentas,
como cuentas de ahorro y cuentas corrientes.
 */

public class Main {

    public static void main(String[] args) {

        Cuentas cuenta1 = new CuentasAhorros("Pedro Roa","12345678","76543218",0);
        Cuentas cuenta2 = new CuentasCorrientes("Maria Perez","1020432984","90127843",100000);

        cuenta1.depositarDinero(200000);
        cuenta1.depositarDinero(535000);
        cuenta1.retirarDinero(30000);
        cuenta1.extractoCuenta();
        System.out.println();
        cuenta2.depositarDinero(250000);
        cuenta2.retirarDinero(50000);
        cuenta2.depositarDinero(380000);
        cuenta2.extractoCuenta();

    }

}
