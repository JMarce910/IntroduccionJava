/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizajeextra1al24;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej24_NPrimerosNumFibonacci {

    /**
     * @param args the command line arguments
     * 
     * Realizar un programa que complete un vector con los N primeros números 
     * de la sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es 
     * la sucesión de los siguientes números:
     * 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
     * Donde cada uno de los números se calcula sumando los dos anteriores a él. 
     * Por ejemplo:La sucesión del número 2 se calcula sumando (1+1)
     * Análogamente, la sucesión del número 3 es (1+2), Y la del 5 es (2+3), Y así sucesivamente…
     * La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula: 
     * Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
     * Fibonaccin = 1 para todo n < = 1
     * Por lo tanto, si queremos calcular el término “n” debemos escribir una 
     * función que reciba como parámetro el valor de “n” y que calcule la serie 
     * hasta llegar a ese valor.

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero natural:");
        int fiboSequence = sc.nextInt();
        System.out.println("El numero " + fiboSequence + " en la sucesion Fibonacci es: " + fibonacci(fiboSequence));
    }

    public static int fibonacci(int num) {
        int startingNum = 1;
        int finalNum = 0;
        int resultado = 0;
        int i;
        switch (num) {
            case 0:
                resultado = 0;
                break;
            case 1:
                resultado = 1;
                break;
            default:
                for (i = 2; i <= num; i++) {
                    resultado = startingNum + finalNum;
                    finalNum = startingNum;
                    startingNum = resultado;
                }
                break;
        }
        return resultado;
    }

}
