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
public class Ej10_IngresarNumsHastaLimite {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 10
     * 
     * Escriba un programa en el cual se ingrese un valor limite positivo, 
     * y a continuación solicite números al usuario hasta que la suma de los 
     * números introducidos supere el limite inicial. 

     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int i; 
        int num;
        int suma = 0; 
         
        System.out.println("Ingrese un número limite positivo");
        int limite = leer.nextInt();
        
        
        do {
            System.out.println("Ingrese un valor que se acumulará hasta llegar al límite");
            num = leer.nextInt();
            suma = suma + num;
        } while (suma <= limite);
        
        System.out.println("Gracias, superaste el limite! La suma de tus numeros es: " + suma);  
    }
    
}
