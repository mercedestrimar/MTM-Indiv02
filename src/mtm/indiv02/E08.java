package mtm.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Mostrar la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Mercedes
 */
public class E08 {

    public static void main(String[] args) {
        //Declaro variables
        int num = 0;
        int resultado = 0;

        Scanner teclado = new Scanner(System.in);
        //Controlo excepciones con try-catch
        try {
            System.out.println("Introduce el número para mostrar la tabla de multiplicar:");
            num = teclado.nextInt();
            //Inicio el bucle for para que "i" se vaya incrementando 
            for (int i = 1; i <= 10; i++) {
                resultado = num * i;
                i = i++;
                System.out.println(num + "*" + i + "=" + resultado);
            }
        } catch (InputMismatchException inputException) {
            System.out.println("Error, El dato introducido no es correcto");
            teclado.next();
        }
    }
}
