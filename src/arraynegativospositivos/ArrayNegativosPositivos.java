/*
5. Programa Java que guarda en un array 10 números enteros que se leen por teclado. 
A continuación se recorre el array y calcula cuántos números son positivos,
cuántos negativos y cuántos ceros.
 */
package arraynegativospositivos;

import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class ArrayNegativosPositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero[] = new int[5];
        int valorNumero;
        int positivo = 0;
        int negativo = 0;
        int ceros = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Valor numero " + "[" + i + "]");
            numero[i] = entrada.nextInt();
        }

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > 0) {
                positivo++;
            } else if (numero[i] < 0) {
                negativo++;
            } else if (numero[i] == 0) {
                ceros++;
            }
            System.out.println("Numeros positivos : " + positivo);
            System.out.println("Numeros negativos : " + negativo);
            System.out.println("Numeros ceros : " + ceros);

        }
    }

}
