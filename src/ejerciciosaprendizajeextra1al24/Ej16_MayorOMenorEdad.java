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
 * 
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los 
 * datos de las personas ingresadas por teclado e indique si son mayores o 
 * menores de edad. Después de cada persona, el programa debe preguntarle al 
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario 
 * ingrese la palabra “No”.
 */
public class Ej16_MayorOMenorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Cuantas personas va a ingresar?");
        int cantPersonas = leer.nextInt();
        leer.skip("\n");
        recibirDatos(leer, cantPersonas);
    }

    public static void recibirDatos(Scanner leer, int cantPersonas) {

        String[] nombre = new String[cantPersonas];

        int[] edad = new int[cantPersonas];

        for (int i = 0; i < cantPersonas; i++) {
            System.out.println("Ingresa el nombre de la persona " + (i + 1));

            nombre[i] = leer.nextLine();
            System.out.println("Ingresa la edad de " + nombre[i]);

            edad[i] = leer.nextInt();
            leer.skip("\n");
        }
    }
    
}
