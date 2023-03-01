package Exercices;
import java.util.Scanner;

public class notasMayores5 {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que, dadas 5 notas finales, determine cuántas notas
		 * fueron mayores o iguales a 3.0
		 */

		Scanner entrada = new Scanner(System.in);
		double contador = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Ingrese nota " + i + " ");
			double notas = entrada.nextDouble();
			if (notas >= 3) {
				contador++;

			}

		}

		System.out.println("Las notas mayores o iguales a 3 fueron :  "+ contador);

	}

}
