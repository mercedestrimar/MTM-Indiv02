package mtm.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Indicar si el número es positivo o negativo mostrando un mensaje por pantalla.
 * Cero como positivo.
 *
 * @author Mercedes
 *https://github.com/mercedestrimar/MTM-Indiv02.git
 */
public class E01 {

    public static void main(String[] args) {
        //Declaro variable
        int numero;

        Scanner teclado = new Scanner(System.in);
        // Controlo excepciones con try-catch
        try {
            System.out.println("Introducir número:");
            numero = teclado.nextInt();
            //Con la estructura if-else calculo si el número es positivo o negativo.
            if (numero >= 0) {
                System.out.println("El número es positivo");

            } else {
                System.out.println("El número es negativo");
            }
        } catch (InputMismatchException e) {
            System.out.println("¡¡ERRROR!! Debe introducir un valor entero");
            teclado.next();
        }

    }
}
