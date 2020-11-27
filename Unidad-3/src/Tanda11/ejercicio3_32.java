package Tanda11;
import java.util.Scanner;

public class ejercicio3_32 
{
	public static void main(String[] args)
	{
		double x, resul=1;
		int n;
		Scanner teclado;
		teclado= new Scanner(System.in);	
		System.out.println("Introduce un numero real distinto de cero ");
		x = teclado.nextDouble();
		System.out.println("Introduce un numero entero positivo o nulo ");
		n = teclado.nextInt();
		for (int i=0; i < n; i++)
			resul= resul* x;
		System.out.println(+x+" elevado a "+n+" es "+resul);
		teclado.close();
	}//main
}// class
