/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizaje14;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej14_CambioDivisas {

    /**
     * @param args the command line arguments
     * 
     * Ejercicio 14
     * 
     * Crea una aplicación que a través de una función nos convierta una cantidad 
     * de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
     * yenes o libras. La función tendrá como parámetros, la cantidad de euros y
     * la moneda a converir que será una cadena, este no devolverá ningún valor 
     * y mostrará un mensaje indicando el cambio (void).
     * El cambio de divisas es: 
     * 0.86 libras es un 1 €
     * 1.28611 $ es un 1 €
     * 129.852 yenes es un 1 €
     * 
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("A que divisa desea convertir: libras, dolares o yenes? ");
        String divisa = leer.nextLine();
        System.out.println("Ingrese la cantidad de euros a convertir: ");
        double money = leer.nextDouble();
        convert(money, divisa);

    }

    public static void convert(double money, String divisa) {
        double exchange = 0;
        String simbolo = "";
        divisa = divisa.toLowerCase();
        switch (divisa) {
            case "dolares":
                exchange = 1.18;
 
                simbolo = "$";
                break;
            case "yenes":
                exchange = 130.21;
                simbolo = "¥";
                break;
            case "libras":
                exchange = 0.86;
                simbolo = "£";
                break;
            default:
                System.out.println("divisa incorrecta ");
                return;
        }

        double conversion = money * exchange;
        System.out.println(money + " euros son " + conversion + " " + simbolo);
    }

}
