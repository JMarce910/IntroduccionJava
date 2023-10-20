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
public class Ej20_CuadroMagico {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 20
     * 
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 
     * 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son 
     * idénticas. Crear un programa que permita introducir un cuadrado por teclado 
     * y determine si este cuadrado es mágico o no. El programa deberá comprobar 
     * que los números introducidos son correctos, es decir, están entre el 1 y el 9.
     * 
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int m = 3;
        int n = 3;
        int[][] matriz = new int[m][n];
        llenarMatriz(m, n, matriz);
        mostrarMatriz(m, n, matriz);
        matrizMagica(m, n, matriz);
    }

    public static void llenarMatriz(int m, int n, int[][] matriz) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(" digite  el numero de la posicion " + i + ", " + j);
                int posicion = leer.nextInt();
                matriz[i][j] = posicion;
            }
        }
    }

    public static void mostrarMatriz(int m, int n, int[][] matriz) {

        System.out.println("Matriz principal:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
    }

    public static void matrizMagica(int m, int n, int[][] matriz) {
        boolean bandera = true;
        int sumDiag2 = 0;
        int sumDiag1 = 0;
        int sumfila = 0;
        int sumcolumn = 0;
        int aux = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumfila += matriz[i][j];
                sumcolumn += matriz[j][i];
            }
            if (sumfila == sumcolumn) {
                aux++;
            }
            sumDiag1 += matriz[i][i];
            sumDiag2 += matriz[i][(m - 1 - i)];

        }
        if (aux == m) {
            System.out.println("La matriz es un cuadro magico");
        } else {
            System.out.println("La matriz NO es un cuadro magico");
        }
    }
    
}
