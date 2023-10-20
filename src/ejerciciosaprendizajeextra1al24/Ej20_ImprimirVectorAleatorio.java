/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizajeextra1al24;

/**
 *
 * @author Pc
 */
public class Ej20_ImprimirVectorAleatorio {

    /**
     * @param args the command line arguments
     * 
     * Crear una función rellene un vector con números aleatorios, pasándole 
     * un arreglo por parámetro. Después haremos otra función o procedimiento 
     * que imprima el vector.

     */
    public static void main(String[] args) {

        int m = 10;
        int[] vector = new int[m];
        llenarMatriz(m, vector);
        mostrarMatriz(m, vector);
    }

    public static void llenarMatriz(int row, int[] matriz) {
        for (int i = 0; i < row; i++) {

            matriz[i] = (int) (Math.random() * 10);

        }

    }

    public static void mostrarMatriz(int m, int[] matriz) {
        System.out.println("Matriz principal:");
        int suma = 0;
        for (int i = 0; i < m; i++) {

            System.out.print("[" + matriz[i] + "] ");

        }
    }

}
