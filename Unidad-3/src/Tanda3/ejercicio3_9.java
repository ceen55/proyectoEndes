package Tanda3;
import java.util.Scanner;

public class ejercicio3_9
{
	public static void main(String[] args) 
	{
		char respuesta;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Quieres continuar (s/n) ");
		respuesta = teclado.next().charAt(0);
		if ((respuesta == 's') || (respuesta == 'n'))
			System.out.println("La respuesta es correcta ");
		else
			System.out.println("La respuesta es erronea no es ni s ni n");
		teclado.close();
	}// main
}// class

