package mtm.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Indicar cuál es el mayor de dos números. Si son iguales ha de notificarlo.
 *
 * @author Mercedes
 */
public class E03 {

    public static void main(String[] args) {
        //Declaro variables
        int num1, num2;
        Scanner teclado = new Scanner(System.in);

        //Controlo excepciones con try-catch
        try {
            System.out.println("Introduce el primer número:");
            num1 = teclado.nextInt();
            System.out.println("Introduce el segundo número:");
            num2 = teclado.nextInt();
            // con la estructura if-else calculamos lo que nos piden.
            if (num1 > num2) {
                System.out.println("El primer número es mayor");
            } else {
                if (num1 < num2) {
                    System.out.println("El segundo número es mayor");
                } else {
                    System.out.println("Los números son iguales");
                }
            }
        } catch (InputMismatchException inputException) {
            System.out.println("¡¡Error!!, El dato introducido no es de tipo entero");

        }
    }
}
