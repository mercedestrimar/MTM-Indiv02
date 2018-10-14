package mtm.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Introducir un número e indicar si es positivo. Si no, finalizará el programa.
 * Si es mayor que cero mostrará los números entre los que es divisible.
 *
 * @author Mercedes
 */
public class E10 {

    public static void main(String[] args) {
        //Declaro variables
        int num = 0;
        boolean salir = false;

        Scanner teclado = new Scanner(System.in);
        //Controlo excepciones
        try {
            System.out.println("Introduce número:");
            num = teclado.nextInt();
            // Con la estructura if-else controlo si el número es positivo
            if (num > 0) {
                System.out.println("El número es POSITIVO y sus DIVISORES son: ");
                //Con el bucle for y la estructura cuento y controlo los divisores del mismo
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        //con if-else doy forma a la salida por pantalla
                        if (num != i) {
                            System.out.print(i + " ,");
                        } else {
                            System.out.println(i + ".");
                            salir = true;
                        }
                    }
                }
            } else {
                System.out.println("El número es negativo");
            }

        } catch (InputMismatchException inputException) {
            System.out.println("Error, El dato introducido no es correcto");
            teclado.next();
        }
    }
}
