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
public class Ej18_MatrizAleatoriaTraspuesta {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 18
     * 
     * . Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz 
     * A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa)
     * 
     */
    public static void main(String[] args) {

        int m = 4;
        int n = 4;
        int[][] matriz = new int[m][n];
        llenarMatriz(m, n, matriz);
        mostrarMatriz(m, n, matriz);
    }

    public static void llenarMatriz(int m, int n, int[][] matriz) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void mostrarMatriz(int m, int n, int[][] matriz) {
        System.out.println("Matriz principal:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        
        }
        System.out.println("");
        System.out.println("Matriz traspuesta:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[j][i] + "] ");
            }
            System.out.println();
        }
    }
}
