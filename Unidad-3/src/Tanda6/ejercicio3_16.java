package Tanda6;
import java.util.Scanner;

public class ejercicio3_16
{
	public static void main(String[] args)
	{
		double distancia,precio;
		int dias;
		Scanner teclado;
		teclado= new Scanner(System.in);
		System.out.println("Introduce la distancia en kilometros: ");
		distancia= teclado.nextDouble();
		System.out.println("Introduce numero de dias: ");
		dias= teclado.nextInt();
		if ((dias > 7) & (distancia > 800))
			precio= distancia * 2.5 - distancia*2.5*0.3;
		else
			precio= distancia * 2.5;
		teclado.close();
		System.out.println("El precio del viaje es de: "+precio+ " euros");
	}// main
} // class
