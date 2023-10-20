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
public class Ej03_VocalOConsonante {

    /**
     * @param args the command line arguments
     * 
     * Ej 03
     * 
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
     * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
     * la función equals() de la clase String.
     */
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese su letra: ");
        String letra= read.nextLine();
        letra=letra.toUpperCase();
        switch(letra) {
            case "A": 
                System.out.println("es la vocal A ");
                break;
            case "E": 
                System.out.println("es la vocal E ");
                break;
            case "I": 
                System.out.println("es la vocal I");
                break;
            case "O":
                System.out.println("es la vocal O");
                break;
            case "U":
                System.out.println("es la vocal U");
                break;     
            default: 
                System.out.println("No es una vocal");
        }
    }
    
}
