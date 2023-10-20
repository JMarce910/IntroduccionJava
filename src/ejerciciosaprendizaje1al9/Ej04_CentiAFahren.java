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
public class Ej04_CentiAFahren {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 04
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
     * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Bienvenido al conversor de grados Centígrados a grados Fahrenheit!");
        System.out.println("Por favor ingrese el valor en grados centígrados: ");
        double cent = leer.nextDouble();
        
        double fah = (32 + (9 * cent / 5));
        System.out.println( cent + " °C equivalen a " + fah + " °F" );
    }
    
}
