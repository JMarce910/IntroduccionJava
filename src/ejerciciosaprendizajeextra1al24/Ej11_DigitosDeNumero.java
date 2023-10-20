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
public class Ej11_DigitosDeNumero {

    /**
     * @param args the command line arguments
     * 
     * Escribir un programa que lea un número entero y devuelva el número de 
     * dígitos que componen ese número. Por ejemplo, si introducimos el número 
     * 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos 
     * matemáticamente utilizando el operador de división. Nota: recordar que 
     * las variables de tipo entero truncan los números o resultados
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Digite un numero: ");
        int num = read.nextInt();
        int count = 0;
        int aux = num;
        aux = Math.abs(aux);
        
        while (aux >= 1) {
            aux = (int) aux / 10;
            count++;
        }
        System.out.println(num + " tiene " + count + " digitos ");
    }
    
}
