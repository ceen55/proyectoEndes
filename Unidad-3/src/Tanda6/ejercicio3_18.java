package Tanda6;
import java.util.Scanner;

public class ejercicio3_18
{
	public static void main(String[] args) 
	{
		float numero;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Intoduce un número ");
		numero = teclado.nextFloat();
		teclado.close();
		if ((numero >= 10) & (numero <= 100))
			System.out.println("El número introducido esta entre 10 y 100");
		else
			if (numero < 10)
				System.out.println("El número introducido es menor de 10");
			else
				System.out.println("El número introducido es mayor de 100");
	}//main
}// class

