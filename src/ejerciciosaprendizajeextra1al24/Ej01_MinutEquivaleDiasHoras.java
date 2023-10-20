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
public class Ej01_MinutEquivaleDiasHoras {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 01
     * 
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
     * ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
     * equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int minutos = leer.nextInt();
        int dias = (int) (minutos / 1440);
        int horas = (int) ((minutos % 1440) / 60);
        int restminutes = minutos - (dias * 1440) - (horas * 60);
        System.out.println(minutos + " minutos  son : " + dias + " dias " + horas + " horas y " + restminutes + " minutos ");
    }
    
}
