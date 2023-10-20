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
public class Ej10_AdivinaResulMultipli {

    /**
     * @param args the command line arguments
     * 
     * Ej 10
     * 
     * Realice un programa para que el usuario adivine el resultado de una 
     * multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
     * El programa debe indicar al usuario si su respuesta es o no correcta. 
     * En caso que la respuesta sea incorrecta se debe permitir al usuario 
     * ingresar su respuesta nuevamente. Para realizar este ejercicio investigue
     * como utilizar la función Math.random() de Java.
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int factor1 = (int) (Math.random() * 50 + 1) + 1;
        int factor2 = (int) (Math.random() * 10 + 1) + 1;
        // Math.random( )* (max -min)+min 

        System.out.println("Cuanto es " + factor1 + " x " + factor2 + " =?");
        int resultado = read.nextInt();

        if (resultado != (factor1 * factor2)) {
            do {
                System.out.println("Fallaste :( intenta de nuevo... ");
                resultado = read.nextInt();
            } while (resultado != (factor1 * factor2));
        }
        System.out.println("CORRECTO");
    }
    
}
