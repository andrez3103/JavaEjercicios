package Exercices;

public class elementosComunes {

	public static void main(String[] args) {
		/*Desarrollar un programa que busque elementos comunes en dos
		arrays de enteros.*/
		
		int [] arreglo1 = {1,2,3,4,5};
		int [] arreglo2 = {1,2,3,4,5};
		
		
		for(int i =0; i<arreglo1.length;i++)
		{
			for(int j=0; j<arreglo2.length;j++)
			
			{
				if(arreglo1[i]== arreglo2[j] )
				{
					System.out.println("Elemento comun " +  arreglo1[i] + " es comun en ambos arreglos");
				}
			}
		}
		
		
	}

}
