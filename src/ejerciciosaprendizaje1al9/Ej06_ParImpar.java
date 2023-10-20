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
public class Ej06_ParImpar {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 06
     * Crear un programa que dado un numero determine si es par o impar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número para saber si es par o impar:");
        double num = leer.nextDouble();
        
        if (num % 2 == 0){
            System.out.println("El número es par");
            
        }else {
            System.out.println("El número es impar");
            
        }
    }
    
}
