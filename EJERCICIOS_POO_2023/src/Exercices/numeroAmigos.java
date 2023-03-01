package Exercices;
import java.util.Scanner;

public class numeroAmigos {

	public static void main(String[] args) {


		/*Se quiere desarrollar un programa que determine si dos números son amigos.
		Dos números enteros positivos se consideran amigos si la suma de los
		divisores de uno es igual al otro número y viceversa.
		Por ejemplo, los números 220 y 284 son amigos. Los divisores del
		número 220 son: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, y suman 284. Los
		divisores de 284 son: 1, 2, 4, 71 y 142, que suman 220.*/

		Scanner entrada = new Scanner(System.in);


		double suma=0;
		double suma1=0;

		System.out.println("NGRESE NUMERO 1 ");
		double numero = entrada.nextDouble();

		System.out.println("NGRESE NUMERO 1 ");
		double numero2 = entrada.nextDouble();


		for(int i =1; i<numero ; i++)
		{
			if(numero%i==0) {
				suma = suma + i;
				System.out.println(i);
			}
		}

        System.out.println("primera suma" + (int)suma);

		for(int i =1 ; i<numero2 ; i++)
		{
			if(numero2%i==0) {
				suma1 = suma1 + i;
				System.out.println(i);
			}
		}
		  System.out.println("segunda suma" + (int)suma1);

			if(suma==numero2 )
			{
				System.out.println("Son numero amigos");
			}else
			{
				System.out.println("No son numero amigos");
			}

	}

}
