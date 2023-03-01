package Exercices;
import java.util.Scanner;

public class factorialNumero {

	public static void main(String[] args) {

		/*Desarrollar un programa que calcule el factorial de un número entero positivo.
		El factorial de un número es el producto de todos los
		números enteros positivos desde 1 hasta el número en cuestión.*/

		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese un numero:");
		int numero = entrada.nextInt();
		int factorial=1;


		for(int i = 1 ; i <=numero ; i++) {

			factorial = factorial*i;

		}

		System.out.println(factorial);


	}

}
