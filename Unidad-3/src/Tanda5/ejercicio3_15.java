package Tanda5;
import java.util.Scanner;

public class ejercicio3_15
{
	public static void main(String[] args)
	{
		int numero;
		Scanner teclado;
		teclado= new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		numero= teclado.nextInt();
		if ((numero>= 1) & (numero <= 10))
			if (numero%2 ==0)
				System.out.println("El n�mero "+numero+" es par");	
			else
				System.out.println("El n�mero "+numero+" es impar");
		else
			System.out.println("El n�mero "+numero+" es erroneo");
		teclado.close();
	}// main
}// class