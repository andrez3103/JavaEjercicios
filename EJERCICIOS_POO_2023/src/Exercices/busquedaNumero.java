package Exercices;

import java.util.Scanner;

public class busquedaNumero {

	public static void main(String[] args) {
		/*
		 * Desarrollar un programa que, dado un número entero, busque dicho número en un
		 * array.
		 */

		int[] arreglo = { 1, 2, 3 };

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		int numero = entrada.nextInt();

		boolean encontrado = false;

		for (int i = 0; i < arreglo.length; i++) {

			if (arreglo[i] == numero) {
				encontrado = true;
				break;
			}

		}
		
		if(encontrado)
		{
			System.out.println("El numero si se encontro " + encontrado);
		}else
		{
			System.out.println("El numero no ha sido encontrado");
		}

	}

}
