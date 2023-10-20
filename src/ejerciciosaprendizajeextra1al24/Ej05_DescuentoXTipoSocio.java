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
public class Ej05_DescuentoXTipoSocio {

    /**
     * @param args the command line arguments
     * 
     * Ej 05
     * 
     * Una obra social tiene tres clases de socios: o Los socios tipo ‘A’ abonan
     * una cuota mayor, pero tienen un 50% de descuento en todos los tipos de
     * tratamientos.
     * Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
     * para los mismos tratamientos que los socios del tipo A.
     * Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos
     * sobre dichos tratamientos. 
     * Solicite una letra (carácter) que representa
     * la clase de un socio, y luego un valor real que represente el costo del
     * tratamiento (previo al descuento) y determine el importe en efectivo a
     * pagar por dicho socio.
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese la letra según el tipo de socio:");
        String letra = read.nextLine();
        letra = letra.toUpperCase();
        double discount = 0;
        
        switch (letra) {
            case "A":
                discount = .50;
                break;
            case "B":
                discount = .35;
                break;
            case "C":
                discount = 0;
                break;
            default:
                System.out.println("Tipo de socio incorrecto ");
        }
        
        if (letra.equals("A") || letra.equals("B") || letra.equals("C")) {
            System.out.println("Cuanto es el precio del tratamiento");
            double price = read.nextDouble();
            System.out.println("El precio a pagar para los socios tipo " + letra + " es de $" + (int) (price - (price * discount)));
        }
    }
    
}
