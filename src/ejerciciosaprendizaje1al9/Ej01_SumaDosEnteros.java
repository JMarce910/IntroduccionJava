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
public class Ej01_SumaDosEnteros {

    /**
     * @param args the command line arguments
     * Ejercicio 01
     * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
     * dos. El programa deberá después mostrar el resultado de la suma
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("El resultado de la suma de " + num1 + " y " + num2 + " es : " + suma );
    }
    
}
