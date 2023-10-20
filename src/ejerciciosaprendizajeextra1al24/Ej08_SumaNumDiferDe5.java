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
public class Ej08_SumaNumDiferDe5 {

    /**
     * @param args the command line arguments
     * 
     * Ej 08
     * 
     * Escriba un programa que lea números enteros. Si el número es múltiplo de 
     * cinco debe detener la lectura y mostrar la cantidad de números leídos, 
     * la cantidad de números pares y la cantidad de números impares. Al igual 
     * que en el ejercicio anterior los números negativos no deben sumarse. 
     * Nota: recordar el uso de la sentencia break.
     * 
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        boolean multiplo = false;
        int pair = 0;
        int odd = 0;
        int count = 0;
        
        do {
            System.out.println("Ingrese un numero");
            int num = read.nextInt();

            if (num > 0) {
                count++;
                if (num % 2 == 0) {
                    pair++;
                } else {
                    odd++;
                }
                if (num % 5 == 0) {
                    multiplo = true;
                    break;
                }
            }

        } while (!multiplo);

        System.out.println("La cantidad de numeros leidos son " + count + "\nLa cantidad de numero pares es " + pair + " \nLa cantidad de numero impares es " + odd);
    }
    
}
