/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizaje1al9;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej07_PalabraEqualsEureka {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 07
     * 
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” 
     * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
     * Incorrecto. Nota: investigar la función equals() en Java.
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String cadena1 = new String("eureka");
        
        System.out.println("Ingresa una palabra y adivina si es la correcta: ");
        String palabra = leer.nextLine();
        
        if (palabra.equals(cadena1)){
            System.out.println("Correcto, haz adivinado. Eureka!!!");
        }else {
            System.out.println("Incorrecto :( ");
        }
        
    }
    
}
