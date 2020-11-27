package Tanda6;
import java.util.Scanner;

public class ejercicio3_17
{
	public static void main(String[] args)
	{
		char letra;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Introduce una letra: ");
		letra = teclado.next().charAt(0);
		if (letra < 'm')
			System.out.println("La letra "+letra+" está situada antes de m");
		else
			System.out.println("La letra "+letra+" está situada despues de m");
		teclado.close();

	}//main
}// class

