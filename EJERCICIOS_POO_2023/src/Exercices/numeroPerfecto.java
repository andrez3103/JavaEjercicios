package Exercices;
import java.util.Scanner;

public class numeroPerfecto {

	public static void main(String[] args) {
		/*
		 * Se quiere desarrollar un programa que determine si un n�mero es un n�mero
		 * perfecto. Un n�mero perfecto es aquel que es igual a la suma de sus divisores
		 * positivos. Por ejemplo, el n�mero 28 es un n�mero perfecto ya que sus
		 * divisores son: 1, 2, 4, 7 y 14, y la suma de estos n�meros es 28.
		 */


		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		int numero = entrada.nextInt();
		int sumaDivisores=0;
		for(int i = 1 ; i<= numero/2 ; i ++)
		{
			if(numero % i == 0 )
			{

				 sumaDivisores += i;
			}
		}

		 if (sumaDivisores == numero) {
	            System.out.println(numero+ " es un n�mero perfecto.");
	        } else {
	            System.out.println(numero + " no es un n�mero perfecto.");
	        }

	}

}
