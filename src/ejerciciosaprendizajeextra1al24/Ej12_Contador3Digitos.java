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
public class Ej12_Contador3Digitos {

    /**
     * @param args the command line arguments
     * 
     * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
     * números del 0- 0-0 al 9-9-9, con la particularidad que cada vez que
     * aparezca un 3 lo sustituya por una E. 
     * Ejemplo: 
     * 0-0-0 
     * 0-0-1 
     * 0-0-2 
     * 0-0-E
     * 0-0-4 
     * 0-1-2 
     * 0-1-E 
     * Nota: investigar función equals() y como convertir números a String.
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        int cont1 = 0;
        String palabra;

        for (int i = 0; i < 1000; i++) {
            palabra = String.valueOf(i);
            if (palabra.contains("3")) {
                palabra = palabra.replace("3", "E");
            }
            switch (palabra.length()) {
                case 1:
                    System.out.println("0-0-" + palabra);
                    break;
                case 2:
                    System.out.println("0-" + palabra.charAt(0) + "-" + palabra.charAt(1));
                    break;
                case 3:
                    System.out.println(palabra.charAt(0) + "-" + palabra.charAt(1) + "-" + palabra.charAt(2));
                    break;

            }

        }
    }

}
