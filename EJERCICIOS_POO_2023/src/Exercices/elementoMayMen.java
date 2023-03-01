package Exercices;

public class elementoMayMen {

	public static void main(String[] args) {
		/*
		 * Desarrollar un programa que determine el elemento mayor y menor de un array
		 * de enteros
		 */

		int[] arreglo = { 1, 2, 3, 4, 5, 6 };
		int mayor = arreglo[0];
		int menor = arreglo[0];

		for (int element : arreglo) {

			System.out.println(element);

		}

		for (int element : arreglo) {

			if (element > mayor) {
				mayor = element;
			}

			if(element< menor) {
				menor = element;

			}
		}

		System.out.println("El elemento mayor es " + mayor);
		System.out.println("El elemento menor es "+ menor);


	}

}
