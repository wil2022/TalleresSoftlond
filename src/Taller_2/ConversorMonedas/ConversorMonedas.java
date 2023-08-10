package Taller_2.ConversorMonedas;


public class ConversorMonedas {

    public void dolaresAEuros(double dolar){
        double euro = dolar * 0.91;
        System.out.println(dolar + " dolares son: " + euro + " euros");

    }

    public void eurosADolares(double euro){
        double dolar = euro * 1.09;
        System.out.println(euro + " euros son: " + dolar + " dolares");
    }

    public void pesosADolares(double pesos){
        double dolar = pesos / 4035.00;
        System.out.println(pesos + " pesos son: " + dolar + " dolares");
    }

    public void pesosAEuros(double pesos){
        double euro = pesos / 4472.89;
        System.out.println(pesos + " pesos son: " + euro + " euros");
    }

}
