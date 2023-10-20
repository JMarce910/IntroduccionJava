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
public class Ej17_NumPrimo {

    /**
     * @param args the command line arguments
     * 
     * Crea una aplicación que nos pida un número por teclado y con una función 
     * se lo pasamos por parámetro para que nos indique si es o no un número 
     * primo, debe devolver true si es primo, sino false.
     * Un número primo es aquel solo puede dividirse entre 1 y si mismo. 
     * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, 
     * sin embargo, 17 si es primo.
     */
    public static void main(String[] args) {
        
      Scanner read = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int n1 = read.nextInt();
        System.out.println(primo(n1));
    }

    public static String primo(int a) {
        int cont = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                cont++;
            }
        }
        if (cont > 2) {
            return "No es primo";
        } else {
            return "Es primo";
        }  
        
    }
    
}
