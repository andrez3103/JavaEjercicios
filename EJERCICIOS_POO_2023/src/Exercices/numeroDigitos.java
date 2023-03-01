package Exercices;
import java.util.Scanner;

public class numeroDigitos {

	public static void main(String[] args) {

		/*
		 * Escribir un programa que, dado un número, determine cuántos dígitos tiene.
		 */


		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero :");
		double numero = entrada.nextInt();

		numero = Math.floor(Math.log10(numero)) + 1  ;

		int cantidadNumero = (int)numero;

		System.out.println("Cantidad de numeros " + cantidadNumero);


	}

}
