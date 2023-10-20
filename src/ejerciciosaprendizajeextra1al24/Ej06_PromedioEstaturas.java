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
public class Ej06_PromedioEstaturas {

    /**
     * @param args the command line arguments
     * 
     * Ej 06
     * Leer la altura de N personas y determinar el promedio de estaturas que 
     * se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de personas");
        int people = read.nextInt();
        double altura1 = 0;
        int cont1 = 0;
        double altura2 = 0;
        
        for (int i = 0; i < people; i++) {
            System.out.println("digite la altura en metros de la persona " + (i + 1));
            double height = read.nextDouble();
            if (height < 1.60) {
                altura1 += height;
                cont1++;
            }
            altura2 += height;
        }
        System.out.println("el promedio de las personas que miden menos de  1.60 m es  " + (altura1 / cont1));
        System.out.println("el promedio de altura de todas las personas es " + (altura2 / people));
    }
    
}
