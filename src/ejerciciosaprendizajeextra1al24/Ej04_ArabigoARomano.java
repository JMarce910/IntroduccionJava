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
public class Ej04_ArabigoARomano {

    /**
     * @param args the command line arguments
     * 
     * Ej 04
     * 
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
     * muestre su equivalente en romano.
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10: ");
        int num= read.nextInt();
        
        switch(num) {
            case 1: 
                System.out.println(1 + " en Romano es I ");
                break;
            case 2: 
                System.out.println(2 + " en Romano es II ");
                break;
            case 3: 
                System.out.println(3 + " en Romano es III ");
                break;
            case 4:
                System.out.println(4 + " en Romano es VI ");
                break;
            case 5:
                System.out.println(5 + " en Romano es V ");
                break;
            case 6:
                System.out.println(6 + " en Romano es VI ");
                break;
            case 7:
                System.out.println(7 + " en Romano es VII ");
                break;
            case 8:
                System.out.println(8 + " en Romano es VIII ");
                break;
            case 9:
                System.out.println(9 + " en Romano es XI ");
                break;
            case 10:
                System.out.println(10 + " en Romano es X ");
                break;
            default: 
                System.out.println("Opción incorrecta");
        }
    }
    
}
