package mtm.indiv02;
import java.util.Scanner;

/**
 * Mostrar los 30 primeros números enteros.
 *
 * @author Mercedes
 */
public class E06 {

    public static void main(String[] args) {
        //Declaro variable
        int numeroEntero = 0;

        Scanner teclado = new Scanner(System.in);
        //Inicio el bucle for para repetir la introdución de números
        for (int i = 0; i < 30; i++) {
            numeroEntero = i + 1;
            // con la estructura if-else doy forma a la salida por pantalla
            if (numeroEntero < 30) {
                System.out.print(numeroEntero + " ,");
            } else {
                System.out.print(numeroEntero + ".");
            }
        }
    }
}
