package Tanda3;
import java.util.Scanner;

public class ejercicio3_8
{
	public static void main(String[] args) 
	{
		int numero;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Intoduce un n�mero,comprendido entre 0 y 10): ");
		numero = teclado.nextInt();
		teclado.close();
		if ((numero < 0) || (numero >10))
			System.out.println("El n�mero introducido es Erroneo");
		else
			System.out.println("El n�mero introducido es Correcto");
			
	}// main

}// class
