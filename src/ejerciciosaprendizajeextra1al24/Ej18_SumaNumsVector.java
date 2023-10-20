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
public class Ej18_SumaNumsVector {

    /**
     * @param args the command line arguments
     * 
     * Realizar un algoritmo que calcule la suma de todos los elementos de un 
     * vector de tamaño N, con los valores ingresados por el usuario
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese el tamanio del vector (N): ");
        int N = read.nextInt();

        int[] vector = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = read.nextInt();
        }

        int sumaTotal = calcularSumaVector(vector);

        System.out.println("La suma de los elementos del vector es: " + sumaTotal);
    }

    public static int calcularSumaVector(int[] vector) {
        int suma = 0;
        for (int elemento : vector) {
            suma += elemento;
        }
        return suma;
    }

}
