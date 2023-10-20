/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizaje15al21;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej17_DigitosDeNumeros {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 17
     * 
     * Recorrer un vector de N enteros contabilizando cuántos números son de 
     * 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese tamaño del vector");
        int n = leer.nextInt();

        int[] vector = new int[n];
        int contador = 0;
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10000 + 1);
            System.out.println(vector[i] = (int) (Math.random() * 10000 + 1));
        }
            for (int j = 1; j < 6; j++) {
               for (int i = 0; i < vector.length; i++) {
                if (String.valueOf(vector[i]).length() == j) {
                    contador++;
                }
            }if (contador > 1) {
                System.out.println("El vector tiene " + contador + " numeros de  " + j + " digitos");
            }
        }
    }
}


