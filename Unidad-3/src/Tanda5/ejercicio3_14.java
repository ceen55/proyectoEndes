package Tanda5;
import java.util.Scanner;

public class ejercicio3_14 
{
	public static void main(String[] args)
	{
		int numero;
		Scanner teclado;
		teclado= new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		numero= teclado.nextInt();
		if (numero%2 ==0)
			System.out.println("El n�mero "+numero+" es par");	
		else
			System.out.println("El n�mero "+numero+" es impar");
		teclado.close();
	}//main
}// class
