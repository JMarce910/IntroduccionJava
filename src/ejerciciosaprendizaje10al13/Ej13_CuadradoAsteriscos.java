/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizaje10al13;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej13_CuadradoAsteriscos {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 13
     * 
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
     * * * * 
     *     *
     *     *
     * * * *
     * 
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del lado");
        int numLado = leer.nextInt();

        for (int i = 0; i < numLado; i++) {
            for (int j = 0; j < numLado; j++) {
                if (i==0 || i==numLado-1 || j==0 || j==numLado-1) {
                    System.out.print(" *");

                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
    }
}
        
    
