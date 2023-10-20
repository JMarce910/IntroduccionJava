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
public class Ej07_ValorMaxMinProm {

    /**
     * @param args the command line arguments
     * 
     * Ej 07
     * 
     * Realice un programa que calcule y visualice el valor máximo, el valor
     * mínimo y el promedio de n números (n>0). El valor de n se solicitará al
     * principio del programa y los números serán introducidos por el usuario.
     * Realice dos versiones del programa, una usando el bucle “while” y otra
     * con el bucle “do - while”.
     * 
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de valores: ");
        int amountValues = read.nextInt();
        int minValue = 0;
        int maxValue = 0;
        double average = 0;
        
        System.out.println("De que manera desea realizar el ejercicio \n 1). para while \n 2). para do while  ");
        int option = read.nextInt();
        
        switch (option) {
            case 1:
                hacerMientras(amountValues, minValue, maxValue, average);
                break;
            case 2:
                mientras(amountValues, minValue, maxValue, average);
                break;
            default:
                System.out.println(" numero erroneo ");
        }

    }

    public static void hacerMientras(int cant, int min, int max, double prom) {
        
        Scanner read = new Scanner(System.in);
        
        int count = 1;
        do {

            System.out.println("digite  un numero  mayor a cero ");
            int num = read.nextInt();
            if (num > max) {
                max = num;
            }
            if (count == 1) {
                min = num;
            }
            if (num < min) {
                min = num;
            }
            prom += num;
            count++;

        } while (count <= cant);
        prom /= cant;
        System.out.println("el valor minimo es " + min + " el valor maximo es " + max + " el  numero promedio  es " + (double) prom);
    }

    public static void mientras(int cant, int min, int max, double prom) {
        
        Scanner read = new Scanner(System.in);
        
        int count = 1;
        while (count <= cant) {
            System.out.println("digite un numero  mayor a cero ");
            
            int num = read.nextInt();
            if (num > max) {
                max = num;
            }
            if (count == 1) {
                min = num;
            }
            if (num < min) {
                min = num;
            }
            prom += num;
            count++;
        }
        prom /= cant;
        System.out.println("el valor minimo es " + min + " el valor maximo es " + max + " el numero promedio es " + (double) prom);  
    }
    
}
