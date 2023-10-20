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
public class Ej21_MatrizPDentroMatrizM {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 21
     * 
     * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y
     * la matriz P de 3x3, se solicita escribir un programa en el cual se
     * compruebe si la matriz P está contenida dentro de la matriz M. Para ello
     * se debe verificar si entre todas las submatrices de 3x3 que se pueden
     * formar en la matriz M, desplazándose por filas o columnas, existe al
     * menos una que coincida con la matriz P. En ese caso, el programa debe
     * indicar la fila y la columna de la matriz M en la cual empieza el primer
     * elemento de la submatriz P. 
     * Ejemplo: 48 Como podemos observar nuestra submatriz P se encuentra en la 
     * matriz M en los índices: 4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
     * 
     */
    public static void main(String[] args) {
        
        int m = 10;
        int p = 3;
        int[][] matrizM = new int[m][m];
        int[][] matrizP = new int[p][p];
        llenarMatriz(m, m, matrizM);
        mostrarMatriz(m, m, matrizM);
        llenarMatrizP(p, p, matrizP);
        mostrarMatriz(p, p, matrizP);
        compararMatriz(m, m, matrizM, matrizP);
    }

    public static void llenarMatriz(int m, int n, int[][] matriz) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void llenarMatrizP(int m, int n, int[][] matriz) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Digite el numero de la posicion " + i + ", " + j);
                int posicion = leer.nextInt();
                matriz[i][j] = posicion;
            }
        }
    }

    public static void mostrarMatriz(int m, int n, int[][] matriz) {
        System.out.println("");
        System.out.println("Matriz principal:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println("__________________________________________");
    }

    public static void compararMatriz(int m, int n, int[][] matriz, int[][] matrizP) {
        boolean matrizEncontrada = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                if (matriz[i][j] == matrizP[0][0]) {
                    boolean bandera = true;
                    for (int k = 0; k < matrizP.length; k++) {

                        for (int l = 0; l < matrizP[0].length; l++) {
                            if (matriz[k + i][l + j] != matrizP[k][l]) {
                                bandera = false;
                                break;

                            }

                        }
                        if (!bandera) {
                            break;
                        }
                    }
                    if (bandera) {
                        matrizEncontrada = true;
                        break;
                    }

                }

            }
            if (matrizEncontrada) {
                break;
            }
        }

        if (matrizEncontrada) {
            System.out.println("");
            System.out.println("La matriz P se encuentra dentro de la matriz M");
        } else {
            System.out.println("");
            System.out.println("La matriz P NO se encuentra dentro de la matriz M");
        }
    }
    
}
