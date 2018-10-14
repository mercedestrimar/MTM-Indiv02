package mtm.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Indicar si el número es positivo o negativo mostrandolo por pantalla. 
 * Si es cero mostrar por pantalla el mensaje: "el número es cero".
 *
 * @author Mercedes
 */
public class E02 {

    public static void main(String[] args) {
        //Declaro variable
        int numero;

        Scanner teclado = new Scanner(System.in);

        //controlo excepciones con try-catch
        try {
            System.out.println("Introducir número:");
            numero = teclado.nextInt();
            //con la estructura if-else calculamos lo pedido
            if (numero > 0) {
                System.out.println("El número  es positivo");
            } else {
                if (numero == 0) {
                    System.out.println("El número es cero");
                } else {
                    System.out.println("El número es negativo");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR, Debe introducir un número entero");
            teclado.next();
        }
    }
}
