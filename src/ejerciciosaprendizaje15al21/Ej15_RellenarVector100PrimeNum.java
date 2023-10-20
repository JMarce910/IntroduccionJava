/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizaje15al21;

/**
 *
 * @author Pc
 */
public class Ej15_RellenarVector100PrimeNum {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 15
     * 
     * Realizar un algoritmo que rellene un vector con los 100 primeros números 
     * enteros y los muestre por pantalla en orden descendente.
     */
    public static void main(String[] args) {
        
        int vector[] = new int[100];

        System.out.println("Rellenemos un vector con los 100 primeros números enteros:");
        System.out.println("");

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
        
    }
    
}

