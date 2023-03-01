package Exercices;
import java.util.Scanner;

public class numeroAmstrong {

	public static void main(String[] args) {
		/*
		 * Se quiere desarrollar un programa que determine si un n�mero es un n�mero de
		 * Amstrong. Un n�mero de Amstrong es aquel que es igual a la suma de sus
		 * d�gitos elevados a la potencia de su n�mero de cifras. Por ejemplo, el n�mero
		 * 371 es un n�mero que cumple dicha caracter�stica ya que tiene tres cifras y:
		 * 371 = 33 + 73 + 13 = 27 + 343 + 1 = 371
		 */

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int numero = entrada.nextInt();

	    double ultimoDigito=0;
	    double digitos;
	    double suma = 0;
	    int numeroOriginal;

	    numeroOriginal= numero;

	    digitos = Math.floor(Math.log10(numero)) + 1;

	    while(numero>0)
	    {
	    ultimoDigito= numero%10;
	    suma = suma + Math.pow(ultimoDigito, digitos);
	    numero = numero / 10;
	    }

	    System.out.println(digitos);
	    System.out.println(ultimoDigito);
	    System.out.println(suma);
	    System.out.println(numero);

	    if(numeroOriginal == suma)
	    {
	    	System.out.println(numeroOriginal + " Es un numero amstrong");
	    }else
	    {
	    	System.out.println(numeroOriginal + " No es un numero amstrong");
	    }

	}

}
