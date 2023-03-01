package Exercices;
import java.util.Scanner;

public class calculoSerie {

	public static void main(String[] args) {

		/*
		 * Escribir un programa que dado un número entero positivo n, calcule la suma de
		 * la siguiente serie: 1 + 1/2 + 1/3 + 1/4 + 1/5 + … + 1/n
		 */
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un numero entero:");
		int numero = entrada.nextInt();
		double suma = 0;

		for (int i = 1; i <= numero; i++)

		{
			suma += 6.0/ i;

		}

		System.out.println("La suma es:" + suma);

	}

}
