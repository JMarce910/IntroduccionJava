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
public class Ej19_MatrizAntisimetrica {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 19
     * 
     * Realice un programa que compruebe si una matriz dada es anti simétrica. 
     * Se dice que una matriz A es anti simétrica cuando ésta es igual a su 
     * propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica 
     * si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se 
     * obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int m = 4;
        int n = 4;
        int[][] matriz = new int[m][n];
        int[][] matrizt = new int[m][n];
        llenarMatriz(m, n, matriz, matrizt);
        mostrarMatriz(m, n, matriz, matrizt);
        compararMatriz(m, n, matriz, matrizt);
    }

    public static void llenarMatriz(int m, int n, int[][] matriz, int[][] matrizt) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                matriz[i][j] = (int) (Math.random() * 100);
                matrizt[i][j] = matriz[i][j] * -1;
            }
        }
    }

    public static void mostrarMatriz(int m, int n, int[][] matriz, int[][] matrizt) {

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
                System.out.print("[" + (matrizt[j][i]) + "] ");

            }
            System.out.println("");

        }
    }

    public static void compararMatriz(int m, int n, int[][] matriz, int[][] matrizt) {
        boolean bandera = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] != (matrizt[i][j] * -1)) {
                    bandera = false;
                    break;
                }

            }
        }

        if (bandera) {
            System.out.println("");
            System.out.println("La matriz es antisimetrica");

        } else {
            System.out.println("");
            System.out.println("La matriz NO es antisimetrica");
        }

    }

}
