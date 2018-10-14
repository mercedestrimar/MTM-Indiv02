package mtm.indiv02;


/**
 * Mostrar los números pares que hay entre el 50 y el 97
 *
 * @author Mercedes
 */
public class E07 {

    public static void main(String[] args) {
        //Declaro variable
        int numerosPares = 0;

      

        //Inicio el bucle for para repetir la introdución de números fijando el inicio y el fin del enunciado
        for (int i = 50; i < 97; i++) {
            // con la estructura de selección if, hallamos los números pares
            if (i % 2 == 0) {
                numerosPares = i;
                //con la estructura if-else damos forma a la salida por pantalla
                if (numerosPares < 96) {
                    System.out.print(numerosPares + " ,");
                } else {
                    System.out.println(numerosPares + ".");
                }
            }
        }
    }
}
