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
public class Ej03_FraseMayusMinus {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 03
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
     * en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());

        
    }
    
}
