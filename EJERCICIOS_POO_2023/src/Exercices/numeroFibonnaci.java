package Exercices;
import java.util.Scanner;

public class numeroFibonnaci {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que calcule los primeros n números de Fibonacci. Los
		 * números de Fibonacci comienzan con 0 y 1, y cada término siguiente es la suma
		 * de los anteriores:, 0, 1 2, 3, 5, 8, 13, 21,
		 */

		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de elementos");
		int numero = entrada.nextInt();
		int fib1 = 0 , fib2 = 1;

		  System.out.println("Los primeros elementos son : ");

	    for(int i = 1 ; i <= numero ; i ++) {


	    	System.out.print(fib1 + " ");
	    	int suma = fib1 +fib2;

	    	fib1 = fib2;
	    	fib2  = suma;
	    }









	}

}
