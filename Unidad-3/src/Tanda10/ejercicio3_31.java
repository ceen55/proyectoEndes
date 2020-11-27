package Tanda10;
import java.util.Scanner;

public class ejercicio3_31 
{
	public static void main(String[] args) 
	{
		int nume,contaposi= 0;
		Scanner teclado;
		teclado= new Scanner(System.in);
		for (int i= 1; i <= 10; i++)
		{	
			System.out.println("Introduce un numero entero  ");
			nume = teclado.nextInt();
			if (nume > 0)
				contaposi++;
		}
		teclado.close();
		System.out.println("La cantidad de números positivos es "+contaposi);
	}
}
