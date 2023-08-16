package Taller_1;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

// 1. Realiza un programa que solicite al usuario dos números enteros y muestre
// su suma, resta, multiplicación y división.

//        String num1 = JOptionPane.showInputDialog("ingresar un numero entero");
//        String num2 = JOptionPane.showInputDialog("ingresar otro numero entero");
//
//        int suma = Integer.parseInt(num1) + Integer.parseInt(num2);
//        int resta = Integer.parseInt(num1) - Integer.parseInt(num2);
//        int multip = Integer.parseInt(num1) * Integer.parseInt(num2);
//
//        JOptionPane.showMessageDialog(null, "la suma de los numeros es: "+ suma);
//        JOptionPane.showMessageDialog(null, "la resta de los numeros es: "+ resta);
//        JOptionPane.showMessageDialog(null, "la multiplicacion de los numeros es: "+ multip);
//
//        double division = Double.parseDouble(num1) / Double.parseDouble(num2);
//        if(Double.parseDouble(num2) == 0){
//            throw new ArithmeticException("no se pude dividir entre cero");
//        }else{
//            JOptionPane.showMessageDialog(null, "la division de los numeros es: " + division);
//        }


//
//------------------------------------------------------------------------------------------------------//

//2. Escribe un programa que pida al usuario un número entero y determine si es
//par o impar

//        String num3 = JOptionPane.showInputDialog("ingresar un numero entero");
//
//        if(Integer.parseInt(num3) % 2 == 0){
//            JOptionPane.showMessageDialog(null, "el numero ingresado es par");
//        }else {
//            JOptionPane.showMessageDialog(null, "el numero ingresado es impar");
//        }
//
//-----------------------------------------------------------------------------------------------------//

//3. Crea un programa que calcule y muestre el área y el perímetro de un círculo.
//El usuario debe proporcionar el radio del círculo.
//
//        String radio = JOptionPane.showInputDialog("ingrese el radio del circulo");
//
//        int r = Integer.parseInt(radio);
//
//        double area = Math.PI*Math.pow(r,2);
//        double perim = 2*Math.PI*r;
//
//        JOptionPane.showMessageDialog(null, "el area del circulo es: "+area);
//        JOptionPane.showMessageDialog(null, "el perimetro del circulo es: "+perim);
//
//-------------------------------------------------------------------------------------------//

//4. Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad
//o menor de edad.
//
//        Integer edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
//
//        String esMayorEdad = (edad < 18) ? "Es menor de edad" : "Es mayor de edad";
//
//        JOptionPane.showMessageDialog(null, esMayorEdad);
//
//----------------------------------------------------------------------------------------------//

//5. Realiza un programa que solicite al usuario dos números enteros y determine
// cuál es el mayor de ellos.

//        Integer numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
//
//        Integer numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero entero"));
//
//        int numMayor = Math.max(numero1, numero2);
//
//        JOptionPane.showMessageDialog(null, "el numero mayor es: "+ numMayor);
//
//-------------------------------------------------------------------------------------------------------//
//
//   6. Escribe un programa que pida al usuario un número y verifique si es positivo,
//   negativo o cero.
//
//        float numb = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero "));
//
//        if(numb > 0){
//            JOptionPane.showMessageDialog(null, "el numero es positivo");
//        } else if (numb < 0) {
//            JOptionPane.showMessageDialog(null, "el numero es negativo");
//        }else{
//            JOptionPane.showMessageDialog(null, "el numero es 0");
//        }
//
//--------------------------------------------------------------------------------------------------------//

// 7. Crea un programa que pida al usuario un número entero positivo y muestre
// su tabla de multiplicar hasta el 10.
//
//        Integer numer = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo"));
//
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(numer + " * " +i +" = "+ numer*i);
//            }
//
//---------------------------------------------------------------------------------------------------------//

//    8. Realiza un programa que simule un juego de adivinar un número. El
//    programa debe generar un número aleatorio entre 1 y 100, y el usuario debe
//    adivinarlo. El programa debe indicar si el número ingresado es mayor o
//    menor que el número a adivinar.

//        int numRandom = new Random().nextInt(100)+1;
//
//        boolean i = true;
//
//        while(i) {
//            Integer numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
//
//            if (numUsuario > numRandom) {
//                JOptionPane.showMessageDialog(null, "el numero ingresado es mayor que el numero a adivinar");
//            } else if (numUsuario < numRandom) {
//                JOptionPane.showMessageDialog(null, "el numero ingresado es menor que el numero a adivinar");
//            } else {
//                JOptionPane.showMessageDialog(null, "Adivinaste el numero");
//                i = false;
//            }
//
//        }



//
//---------------------------------------------------------------------------------------------------------//
//
// 9. Escribe un programa que solicite al usuario un número entero positivo y
// calcule su factorial.
//
//        Integer numFact = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo"));
//
//        int j = 1;
//
//        for (int i = 1; i <= numFact; i++) {
//              j *= i;
//        }
//        JOptionPane.showMessageDialog(null, "el factorial de "+numFact+" es: "+j);

//
//----------------------------------------------------------------------------------------------------------//

//    10.Ejercicio 10: Crea un programa que muestre los primeros 20 números de la
//    serie Fibonacci. La serie Fibonacci se forma sumando los dos números
//    anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …

//        int[] serieFibo = new int[20];
//
//        serieFibo[0] = 0;
//        serieFibo[1] = 1;
//
//        for (int i = 1;i < serieFibo.length - 1; i++){
//            serieFibo[i+1] = serieFibo[i-1] + serieFibo[i];
//
//        }
//
//        for (int n: serieFibo) {
//            System.out.print(n+", ");
//        }


//

//-----------------------------------------------------------------------------------------------//

//    11. Escribe un programa que calcule el área de un triángulo utilizando la fórmula
//    de Herón. El usuario debe ingresar las longitudes de los tres lados.

//        Double ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado A"));
//        Double ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado B"));
//        Double ladoC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado C"));
//
//        double s = (ladoA + ladoB + ladoC)/2;
//
//        double area = Math.sqrt(s*(s - ladoA)*(s - ladoB)*(s - ladoC));
//
//        double roundArea = Math.round(area*100.0)/100.0;
//
//        JOptionPane.showMessageDialog(null, "el area del triangulo es: "+roundArea);

//
//------------------------------------------------------------------------------------------------------//

//    12.Realiza un programa que pida al usuario un número entero y determine si es
//    un número primo o no.

//    Integer numPrimo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo"));
//
//    int k = 0;
//
//        for (int i = 1; i <= numPrimo; i++) {
//            if(numPrimo % i == 0) k++;
//        }
//
//        String esPrimo = (k == 2) ? numPrimo + " Es un numero primo" : numPrimo + " no es un numero primo";
//        JOptionPane.showMessageDialog(null, esPrimo);

//-----------------------------------------------------------------------------------------------------//

//        13.Pide al usuario un número decimal y muestra su valor redondeado a un
//        número específico de decimales

//        Double numDecimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero decimal"));
//
//        double roundNum = Math.round(numDecimal*100.0)/100.0;
//
//        JOptionPane.showMessageDialog(null, roundNum);

//
//---------------------------------------------------------------------------------------------------//

//        14.Escribe un programa que solicite al usuario un número entero positivo y
//        verifique si es un número perfecto. Un número perfecto es aquel cuya suma
//        de sus divisores propios (excluyendo al propio número) es igual al número.

//        Integer num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo"));
//
//        ArrayList<Integer> divisores = new ArrayList<>();
//
//        int suma = 0;
//
//        for(int i = 1; i < num; i ++){
//            if(num % i == 0){
//                divisores.add(i);
//            }
//        }
//            for (int d :divisores) {
//                suma += d;
//            }
//
//            String numPerfecto = (suma == num) ? num+" Es un numero perfecto" : num+" No es un numero perfecto";
//
//            JOptionPane.showMessageDialog(null, numPerfecto);
//
//
//--------------------------------------------------------------------------------------------------//

//        15.Crea un programa que pida al usuario un número entero y determine si es un
//        número capicúa. Un número capicúa es aquel que se lee igual de izquierda a
//        derecha que de derecha a izquierda.


//        Integer num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo"));
//
//        String numStr = Integer.toString(num);
//
//        String numInvert = new StringBuilder(numStr).reverse().toString();
//
//        if (numStr.equals(numInvert)) {
//            JOptionPane.showMessageDialog(null, "El número " + num + " es capicúa.");
//        } else {
//            JOptionPane.showMessageDialog(null, "El número " + num + " no es capicúa.");
//        }


//
//---------------------------------------------------------------------------------------------------//
//        16.Realiza un programa que calcule e imprima la serie de Fibonacci hasta un
//        número dado ingresado por el usuario.

//        Integer num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo"));
//
//        int[] serieFibo = new int[num];
//
//        serieFibo[0] = 0;
//        serieFibo[1] = 1;
//
//        for (int i = 1;i < serieFibo.length - 1; i++){
//            serieFibo[i+1] = serieFibo[i-1] + serieFibo[i];
//
//        }
//
//        for (int n: serieFibo) {
//            System.out.print(n+", ");
//        }
//
//
//---------------------------------------------------------------------------------------------------//

//        17.Pide al usuario dos números enteros y muestra todos los números primos
//        que se encuentran en ese rango.
//
//        Integer numEntero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
//        Integer numEntero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero entero"));
//
//        ArrayList<Integer> numPrimos = new ArrayList<>();
//
//        for (int i = numEntero1; i <= numEntero2; i++) {
//            int h = 0;
//            for (int j = 1; j <= i; j++){
//                if(i % j == 0) h++;
//            }
//            if(h == 2) numPrimos.add(i);
//        }
//
//        for (int i : numPrimos) {
//            System.out.println(i);
//        }

//------------------------------------------------------------------------------------------------//
//        18.Crea un programa que genere una contraseña aleatoria de 8 caracteres que
//        contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la
//        clase Math para generar números aleatorios y la clase String para manipular
//        la contraseña.

//        String caracteres = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//
//
//        StringBuilder contraseña = new StringBuilder();
//
//        for(int i = 1; i <= 8; i++){
//
//            int randomNum = (int)(Math.random() * caracteres.length());
//            char randomChar = caracteres.charAt(randomNum);
//            contraseña.append(randomChar);
//        }
//
//        System.out.println(contraseña);





//------------------------------------------------------------------------------------------------//

//        19.Escribe un programa que solicite al usuario su nombre y luego lo imprima en
//        mayúsculas y minúsculas

//        String nombre = JOptionPane.showInputDialog("ingrese su nombre");
//
//        JOptionPane.showMessageDialog(null, nombre.toUpperCase());
//        JOptionPane.showMessageDialog(null, nombre.toLowerCase());
//
//-------------------------------------------------------------------------------------------------//

//        20.Realiza un programa que solicite al usuario una cadena y luego invierta su
//        orden
//
//        String cadena = JOptionPane.showInputDialog("ingrese una cadena de string");
//
//        StringBuilder strb = new StringBuilder(cadena);
//        cadena = strb.reverse().toString();
//
//        JOptionPane.showMessageDialog(null, cadena);

//-------------------------------------------------------------------------------------------------//

//        21.Pide al usuario una cadena y muestra cuántas veces aparece una letra
//        específica en ella

//        String cadena = JOptionPane.showInputDialog("ingrese una cadena de string");
//
//        char[] letras = cadena.toCharArray();
//        char ch = 'n';
//        int cont = 0;
//
//        for (char l:letras) {
//            if(l == ch) cont++;
//        }
//
//        JOptionPane.showMessageDialog(null, "la letra "+ch+" aparece "+cont+" veces");


//-------------------------------------------------------------------------------------------------//

//        22.Escribe un programa que solicite al usuario una frase y verifique si es un
//        palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)

//        String frase = JOptionPane.showInputDialog("ingrese una frase");
//        String frase1 = frase.replace(" ","");
//
//        StringBuilder strb = new StringBuilder(frase);
//        frase = strb.reverse().toString();
//        String frase2 = frase.replace(" ","");
//
//        if(frase1.equals(frase2)){
//            JOptionPane.showMessageDialog(null, "la frase es un palindromo");
//        }else{
//            JOptionPane.showMessageDialog(null, "la frase no es un palindromo");
//        }

//-------------------------------------------------------------------------------------------------//

//        23.Crea un programa que pida al usuario una oración y muestre cuántas
//        palabras contiene

//        String oracion = JOptionPane.showInputDialog("ingrese una oracion");
//        String[] palabras = oracion.split("\\s+");
//        JOptionPane.showMessageDialog(null, "la oracion contiene "+palabras.length+" palabras");

//----------------------------------------------------------------------------------------------------//

//        24.Realiza un programa que solicite al usuario una cadena y reemplace todas
//        las apariciones de una letra específica por otra

//        String cadena = JOptionPane.showInputDialog("ingrese una cadena de string");
//        String cadena1 = cadena.replace("a","e");
//        JOptionPane.showMessageDialog(null, cadena1);

//----------------------------------------------------------------------------------------------------//

//        25.Pide al usuario una frase y muestra cada palabra por separado

//        String frase = JOptionPane.showInputDialog("ingrese una frase");
//        String[] palabra = frase.split("\\s+");
//
//        for (String p: palabra) {
//            JOptionPane.showMessageDialog(null, p);
//        }

//----------------------------------------------------------------------------------------------------//

//        26.Escribe un programa que pida al usuario una cadena y muestre cuántos
//        caracteres tiene sin contar los espacios en blanco

//        String cadena = JOptionPane.showInputDialog("ingrese una cadena de string");
//        String cadena1 = cadena.replace(" ","");
//        JOptionPane.showMessageDialog(null, "la cadena tiene "+cadena1.length()+" caracteres");

//---------------------------------------------------------------------------------------------------//

//        27.Crea un programa que solicite al usuario una frase y luego muestre las
//        palabras ordenadas alfabéticamente

//        String frase = JOptionPane.showInputDialog("ingrese una frase");
//        String[] palabra = frase.split("\\s+");
//        Arrays.sort(palabra);
//
//        for (String p : palabra) {
//
//            System.out.println(p);
//
//        }

//-------------------------------------------------------------------------------------------//

//        28.Suma de elementos: Escribe un programa que calcule la suma de todos los
//        elementos en un arreglo de enteros.

//        int[] numeros = {2,5,8,14,7,1};
//
//        int suma = 0;
//
//        for (int n : numeros) {
//            suma += n;
//        }
//
//        System.out.println(suma);

//--------------------------------------------------------------------------------------------//

//        29.Encontrar el número más grande: Crea un programa que encuentre el número
//        más grande en un arreglo de enteros.

//        int[] numeros = {4,7,14,56,21,40};
//
//        int numMayor = numeros[0];
//
//        for (int n:numeros) {
//            if(n > numMayor){
//                numMayor = n;
//            }
//        }
//
//        System.out.println(numMayor);

//-------------------------------------------------------------------------------------------//

//        30.Eliminar duplicados: Diseña un programa que elimine los elementos
//        duplicados de un arreglo.

//        int[] arreglo = { 2, 5, 6, 2, 4, 9, 5, 7, 5, 1 };
//
//        HashSet<Integer> arregloUnico = new HashSet<>();
//
//        for (int i = 0; i < arreglo.length; i ++) {
//            arregloUnico.add(arreglo[i]);
//        }
//
//        for (int u : arregloUnico) {
//            System.out.print(u + ", ");
//        }


//--------------------------------------------------------------------------------------------//

//        31.Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo,
//        el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros
//        de manera ascendente.


//        int[] arreglo = {20, 43, 12, 50, 8, 10, 2, 27, 16, 3};
//
//        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
//
//        //algoritmo de seleccion
//        for (int i = 0; i < arreglo.length - 1; i++) {
//            for (int j = i + 1; j < arreglo.length; j++) {
//                if (arreglo[i] > arreglo[j]) {
//                    int temporal = arreglo[i];
//                    arreglo[i] = arreglo[j];
//                    arreglo[j] = temporal;
//                }
//            }
//        }
//
//        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));



//--------------------------------------------------------------------------------------------//

//        32.Buscar un elemento: Escribe un programa que busque un número específico
//        en un arreglo y muestre su índice (o un mensaje si no se encuentra).

//        int[] numeros = {12, 5, 4, 78, 6, 28, 1, 8};
//        int buscarNum = 4;
//        int indice = -1;
//
//
//        for(int i = 0; i < numeros.length; i++){
//            if(numeros[i] == buscarNum) {
//                indice = i;
//                break;
//            }
//        }
//
//        if(indice != -1){
//            System.out.println("el numero " + buscarNum + " esta ubicado en el indice "+indice);
//        }else{
//            System.out.println("el numero " + buscarNum + " no se encuentra en el arreglo");
//        }



//-------------------------------------------------------------------------------------------//

//        33.Frecuencia de elementos: Escribe un programa que cuente la frecuencia de
//        cada elemento en un arreglo.


//        int[] arregloNum ={2, 5, 2, 7, 1, 5, 8, 7, 1};
//
//        for (int i = 0; i < arregloNum.length; i++) {
//            int count = 1;
//
//            if (arregloNum[i] != -1) {
//                for (int j = i + 1; j < arregloNum.length; j++) {
//                    if (arregloNum[j] == arregloNum[i]) {
//                        count++;
//                        arregloNum[j] = -1;
//                    }
//                }
//
//                System.out.println("El elemento " + arregloNum[i] + " aparece " + count + " veces.");
//            }
//        }




//---------------------------------------------------------------------------------------------//

//        35.Rotación de elementos: Implementa un programa que rote los elementos de
//        un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.

//        int[] arreglo = { 4, 8, 9, 12, 3, 24, 2, 31 };
//        int pos = 4;
//
//        int[] arregloRotadoIzq = new int[arreglo.length];
//        int[] arregloRotadoDer = new int[arreglo.length];
//
//        for (int i = 0; i < arreglo.length; i++) {
//            int nuevoIndice = (i + pos) % arreglo.length;
//            arregloRotadoIzq[nuevoIndice] = arreglo[i];
//        }
//
//        for (int i = 0; i < arreglo.length; i++) {
//            int nuevoIndice = (i + (arreglo.length - pos)) % arreglo.length;
//            arregloRotadoDer[nuevoIndice] = arreglo[i];
//        }
//
//        System.out.println("Arreglo: " + Arrays.toString(arreglo));
//        System.out.println("Arreglo rotado a la izquierda: " + Arrays.toString(arregloRotadoIzq));
//        System.out.println("Arreglo rotado a la derecha: " + Arrays.toString(arregloRotadoDer));


//---------------------------------------------------------------------------------------------//

//        36.Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar
//        del 1 al 10. Usa para esto una matriz

//      int[][] tablas = new int[10][10];
//
//
//      for(int i = 0; i < tablas.length; i++){
//          for(int j = 0; j < tablas.length; j++){
//              tablas[i][j] = (i + 1)*(j + 1);
//          }
//      }
//
//        //imprime la matriz
//        for (int i = 0; i < tablas.length; i++) {
//            for (int j = 0; j < tablas[i].length; j++) {
//                System.out.printf("%5d", tablas[i][j]);
//            }
//            System.out.println();
//        }

//---------------------------------------------------------------------------------------------//

    }
}
