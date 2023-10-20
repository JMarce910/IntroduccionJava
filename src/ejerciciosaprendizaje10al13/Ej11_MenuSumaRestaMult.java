/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizaje10al13;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej11_MenuSumaRestaMult {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 11
     * 
     * Realizar un programa que pida dos números enteros positivos por teclado y 
     * muestre por pantalla el siguiente menú:
     * MENU
     * 1. Sumar
     * 2. Restar
     * 3. Multiplicar
     * 4. Dividir
     * 5. Salir
     * Elija opción:
     * El usuario deberá elegir una opción y el programa deberá mostrar el 
     * resultado por pantalla y luego volver al menú. El programa deberá ejecutarse 
     * hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona 
     * la opción 5, en vez de salir del programa directamente, se debe mostrar 
     * el siguiente mensaje de confirmación: 
     * ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona 
     * el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
     * 
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double resultado;
        boolean salir = false;

        
        do {
            System.out.println("MENU");
            System.out.println("1. Suma \n2. Resta \n3. Multiplicación \n4. Division \n5. Salir");
            System.out.println("Eliga una opcion: ");
            int operacion = leer.nextInt();
            double num1;
            double num2;

            System.out.println(" ");

            switch (operacion) {
                case 1:
                    System.out.println("Ingrese dos números enteros positivos: ");
                    num1 = leer.nextDouble();
                    num2 = leer.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    System.out.println("Ingrese dos números enteros positivos: ");
                    num1 = leer.nextDouble();
                    num2 = leer.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    System.out.println("Ingrese dos números enteros positivos: ");
                    num1 = leer.nextDouble();
                    num2 = leer.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    System.out.println("Ingrese dos números enteros positivos: ");
                    num1 = leer.nextDouble();
                    num2 = leer.nextDouble();
                    resultado = num1 / num2;
                    if (num2 != 0) {
                        System.out.println("El resultado de la division es: " + resultado);
                    } else {
                        System.out.println("No se puede dividir por cero.");
                    }
                    break;
                case 5:
                    System.out.print("¿Esta seguro que desea salir del programa (S/N)? ");
                    char confirmacion = leer.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's') {
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("La opcion es inválida");
                    break;

            }

        } while(!salir);
          
    }
}

