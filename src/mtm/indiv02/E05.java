package mtm.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Mostrar el menú. 
 * 1. Suma 
 * 2. Resta 
 * 3. Multiplicación 
 * 4. División 
 * 5. Salir 
 * Si se pulsa un número correcto debe mostrar un mensaje indicando que operación
 * se realizaría. Si no coincide debe mostrar por pantalla "Este número no
 * coincide con ninguna de las opciones disponibles".
 *
 * @author Mercedes
 */
public class E05 {

    public static void main(String[] args) {
        //Declaro variables
        int num1, num2, suma, resta, multiplicacion, opcion = 0;
        float division;
        Scanner teclado = new Scanner(System.in);

        //comienzo con el bucle do-while para que el programa se repita y muestre el menú hasta la condición puesta 
        do {
            //Controlo excepciones con try-catch
            try {
                System.out.println("1.Suma\n"
                        + "2.Resta\n"
                        + "3.Multiplicación\n"
                        + "4.División\n"
                        + "5.Salir");

                System.out.println("Introduce una opción:");
                opcion = teclado.nextInt();
                //Comienzo el switch para que poder ejecutar el menú
                switch (opcion) {
                    case 1:
                        System.out.println("*SUMA*\nIntroduce el primer número:");
                        num1 = teclado.nextInt();
                        System.out.println("Introduce el segundo número:");
                        num2 = teclado.nextInt();
                        suma = num1 + num2;
                        System.out.println("El resultado de la suma es: " + suma);
                        break;
                    case 2:
                        System.out.println("*RESTA*\nIntroduce el primer número:");
                        num1 = teclado.nextInt();
                        System.out.println("Introduce el segundo número:");
                        num2 = teclado.nextInt();
                        resta = num1 - num2;
                        System.out.println("El resultado de la resta es: " + resta);
                        break;
                    case 3:
                        System.out.println("*MULTIPLICACIÓN*\nIntroduce el primer número:");
                        num1 = teclado.nextInt();
                        System.out.println("Introduce el segundo número:");
                        num2 = teclado.nextInt();
                        multiplicacion = num1 * num2;
                        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
                        break;
                    case 4:
                        System.out.println("*DIVISIÓN*\nIntroduce el primer número:");
                        num1 = teclado.nextInt();
                        System.out.println("Introduce el segundo número:");
                        num2 = teclado.nextInt();
                        division = (float) num1 / num2;
                        System.out.println("El resultado de la división es: " + division);
                        break;
                    case 5:
                        System.out.println("SALIR");
                        break;
                    default:
                        System.out.println("Este número no coincide con ninguna de las opciones disponibles");
                }
            } catch (InputMismatchException inputException) {
                System.out.println("¡¡Error!! El dato introducido no es de tipo entero");
                teclado.next();
            } catch (ArithmeticException arException) {
                System.out.println("¡¡Error!! La división no se puede llevar a cabo. El denominador es 0");
            }
            
        } while (opcion != 5);
    }
}
