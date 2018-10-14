package mtm.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Dos números desde teclado. Y realizar una de las siguientes acciones: 
 * Si el primer número es mayor que el segundo realice la resta. 
 * Si el primer número es menor que el segundo realice la suma. 
 * Si los números son iguales realice la multiplicación.
 *
 * @author Mercedes
 */
public class E04 {

    public static void main(String[] args) {
        //Declaro variables
        int num1, num2, resta, suma, multiplicacion;

        Scanner teclado = new Scanner(System.in);

        // controlo excepciones con try-catch
        try {
            System.out.println("Introduce el primer número:");
            num1 = teclado.nextInt();
            System.out.println("Introduce el segundo número:");
            num2 = teclado.nextInt();
            //con la estructura if-else vamos seleccionando y calculamos lo pedido
            if (num1 > num2) {
                resta = num1 - num2;
                System.out.println("El resultado de la resta es:" + resta);
            } else {
                if (num1 < num2) {
                    suma = num1 + num2;
                    System.out.println("El resultado de la suma es:" + suma);
                } else {
                    multiplicacion = num1 * num2;
                    System.out.println("El resultado de la multiplicación es:" + multiplicacion);
                }
            }

        } catch (InputMismatchException inputException) {
            System.out.println("Error, El dato introducido no es correcto, debe introducir un entero");
            teclado.next();
        }
    }
}
