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
public class Ej13_EscalerasNumero {

    /**
     * @param args the command line arguments
     * 
     * Crear un programa que dibuje una escalera de números, donde cada línea 
     * de números comience en uno y termine en el número de la línea. Solicitar 
     * la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa 
     * el número 3: 
     * 1
     * 12
     * 123
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite un número natural: ");
        int n1 = read.nextInt();
        escalera(n1);

    }

    public static void escalera(int num) {
        String txt = "";
        for (int i = 1; i <= num; i++) {
            txt += String.valueOf(i);
            System.out.println(txt);
        }
    }
    
}
