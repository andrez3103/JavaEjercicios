package Exercices;

public class elementosDuplicados {

	public static void main(String[] args) {


		/*Se desea desarrollar un programa que, dado un array de números enteros,
		determine cuáles son sus elementos que se encuentran duplicados.*/


		int [] arreglo = {10,2,3,4,5,6,7,4,9,2,10};

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("Elemento [" + i + "] = " + arreglo[i]);
			}

		for (int i = 0 ; i <= arreglo.length ; i++) {
			for(int j =i+1; j< arreglo.length;j++)
			{

				if ((arreglo[i] == arreglo[j]) && (i != j)) {
					System.out.println("Arreglo duplicado:" + arreglo[j]);
				}
			}
		}


	}

}
