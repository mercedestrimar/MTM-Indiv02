package mtm.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Mostrar tabla de multiplicar de número y que diga si queremos mostrar otra tabla de multiplicar. 
 * Si se introduce una 's' volverá a comenzar el programa y pedirá un nuevo número del que mostrar la tabla de multiplicar y
 * realizará nuevamente la pregunta de si se quiere mostrar una tabla de multiplicar.
 *
 * @author Mercedes
 */
public class E09 {

    public static void main(String[] args) {
        //Declaro variables
        int num = 0;
        int resultado = 0;
        String respuesta = "";
        boolean continuar;
        Scanner teclado = new Scanner(System.in);
        //Controlo con el bucle do-While que tabla queremos mostrar y controlamos excepciones con try-catch
        do {

            try {

                System.out.println("Introduce el número para mostrar la tabla de multiplicar:");
                num = teclado.nextInt();
                //Iniciamos el bucle for para incrementar el valor de "i"
                for (int i = 1; i <= 10; i++) {

                    resultado = num * i;
                    i = i++;
                    System.out.println(num + "*" + i + "=" + resultado);
                }

                if (teclado.hasNextLine()); //Esto es tuyo del año pasado. Hasta aquí no llego yo, todavía!!!!
                teclado.nextLine();
                
                //Controlamos con el bucle do-While si queremos mostrar otra tabla
                do {
                    System.out.println("¿quieres mostrar otra tabla de multiplicar? (s/n)");
                    respuesta = teclado.nextLine();
                    if (respuesta.equals("s")|| respuesta.equals("n")) {
                        continuar = true;
                    } else {
                        System.out.println("ERROR, NO es la respuesta adecuada");
                    }
                } while (!(respuesta.equals("s") || respuesta.equals("n")));

            } catch (InputMismatchException inputException) {
                System.out.println("Error, El dato introducido no es correcto");
                teclado.next();
            }

        } while (respuesta.equals("s"));
    }
}
