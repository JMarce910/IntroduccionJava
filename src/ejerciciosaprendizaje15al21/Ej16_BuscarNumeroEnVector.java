/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizaje15al21;

import java.util.Scanner;

/**
 * @author Pc
 */
public class Ej16_BuscarNumeroEnVector {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 16
     * 
     * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios 
     * y le pida al usuario un numero a buscar en el vector. El programa mostrará 
     * donde se encuentra el numero y si se encuentra repetido.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int num = leer.nextInt();
        int[] vector = new int[num];

        for (int i = 0; i < vector.length; i++) {
            int aleatorio = (int) (Math.random() * 10);
            vector[i] = aleatorio;
            System.out.println(vector[i] = aleatorio);

        }
        System.out.println("ingrese  un numero para buscarlo en el vector  ");
        int buscar = leer.nextInt();
        int aux = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar) {
                aux++;
            }
        }
        if (aux == 0) {
            System.out.println("el numero no se encuentra en el vector ");
        } else if (aux == 1) {
            System.out.print("el numero esta en el vector ");
        } else {
            System.out.print("el numero esta en el vector y esta repetido ");
        }
    }
}

