package Exercices;
import java.util.Scanner;

public class factorialNumero {

	public static void main(String[] args) {

		/*Desarrollar un programa que calcule el factorial de un n�mero entero positivo.
		El factorial de un n�mero es el producto de todos los
		n�meros enteros positivos desde 1 hasta el n�mero en cuesti�n.*/

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
