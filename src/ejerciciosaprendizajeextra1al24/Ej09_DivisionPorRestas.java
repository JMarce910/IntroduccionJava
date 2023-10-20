/*
 */
package ejerciciosaprendizajeextra1al24;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej09_DivisionPorRestas {

    /**
     * @param args the command line arguments
     * 
     * Ej 09
     * 
     * Simular la división usando solamente restas. Dados dos números enteros 
     * mayores que uno, realizar un algoritmo que calcule el cociente y el residuo 
     * usando sólo restas. Método: Restar el dividendo del divisor hasta obtener 
     * un resultado menor que el divisor, este resultado es el residuo, y el 
     * número de restas realizadas es el cociente. 
     * Por ejemplo: 50 / 13:
     * 50 – 13 = 37 una resta realizada 
     * 37 – 13 = 24 dos restas realizadas 
     * 24 – 13 = 11 tres restas realizadas 
     * dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
     * ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
     * 
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int dividendo, divisor, cociente = 0, resto;
        System.out.println("Digite el dividendo: ");
        dividendo = leer.nextInt();
        System.out.println("Digite el divisor: ");
        divisor = leer.nextInt();
        int resultado;

        do {
            resultado = dividendo - divisor;
            System.out.println(dividendo + " - " + divisor + " = " + resultado);
            cociente++;
            dividendo = resultado;
        } while (resultado >= divisor);

        resto = dividendo;
        System.out.println("El residuo es " + resto + " y el cociente es " + cociente);
      
    }
    
}
