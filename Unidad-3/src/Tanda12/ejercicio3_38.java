package Tanda12;

import java.util.*;

public class ejercicio3_38
{
	public static void main(String[] args) 
	{
		boolean sw= false;
		int conta, nume;
		Scanner teclado;
		teclado= new Scanner (System.in);
		for (conta= 1; conta <= 10; conta++)
		{
			System.out.println("Intoduce un n�mero: ");
			nume = teclado.nextInt();
			if (nume== 5)
				sw= true;
		}
		teclado.close();
		if (sw)
			System.out.println("Hay alg�n 5 ");
		else
			System.out.println("No hay ningun 5 ");
	}
}
