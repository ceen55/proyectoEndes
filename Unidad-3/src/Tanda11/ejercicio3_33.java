package Tanda11;
import java.util.Scanner;

public class ejercicio3_33 
{
	public static void main(String[] args) 
	{
		int nume, conta= 1, factorial= 1;
		Scanner teclado;
		teclado= new Scanner(System.in);	
		System.out.println("Introduce un numero entero positivo ");
		nume = teclado.nextInt();
		while (conta <= nume )
		{
			factorial = factorial * conta;
			conta++;
		}
		teclado.close();
		System.out.println("El factorial de "+nume+" es "+factorial);
	}//main
}//class
