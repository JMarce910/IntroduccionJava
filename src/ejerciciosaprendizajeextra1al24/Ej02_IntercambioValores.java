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
public class Ej02_IntercambioValores {

    /**
     * @param args the command line arguments
     * 
     * Ej 02
     * 
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
     * diferente a cada una. A continuación, realizar las instrucciones
     * necesarias para que: B tome el valor de C, C tome el valor de A, A
     * tome el valor de D y D tome el valor de B. Mostrar los valores iniciales
     * y los valores finales de cada variable. Utilizar sólo una variable
     * auxiliar.
     */
    public static void main(String[] args) {
        
        Scanner leer =new Scanner(System.in);
        int A=5;
        int B=8;
        int C=4;
        int D=6;
        int aux=B;
        
        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de B es: " + B);
        System.out.println("El valor de C es: " + C);
        System.out.println("El valor de D es: " + D);
        System.out.println("");
        
        B=C;
        C=A;
        A=D;
        D=aux;
        
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("El nuevo valor de A es: " + A );
        System.out.println("El nuevo valor de B es: " + B );
        System.out.println("El nuevo valor de C es: " + C );
        System.out.println("El nuevo valor de D es: " + aux );
       
        
    }
    
}
