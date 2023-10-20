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
public class Ej08_LongitudPalabra {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 08
     * 
     * Realizar un programa que solo permita introducir solo frases o palabras 
     * de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo 
     * se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en 
     * caso contrario, se deberá imprimir “INCORRECTO”. 
     * Nota: investigar la funcion Lenght() en Java.
     */
    public static void main(String[] args) {
        
      Scanner leer = new Scanner(System.in);
      
        System.out.println("Ingrese una palabra: ");
        String palabra = leer.nextLine();      

       if(palabra.length() == 8){
           System.out.println("CORRECTO");
       }else{
           System.out.println("INCORRECTO");
       }       
        
    }
    
}
