package Tanda11;
import java.util.Scanner;

public class ejercicio3_35
{
	public static void main(String[] args)
	{
		int opcion;
		Scanner teclado;
		teclado= new Scanner(System.in);
		System.out.println("1.- Atlas ");
		System.out.println("2.- Bajas ");
		System.out.println("3.- Modificaciones ");
		System.out.println("4.- Consultas ");
		System.out.println("5.- Salir ");
		System.out.println("Introduce Opcion ");
		opcion= teclado.nextInt();
		while (opcion != 5)
		{
			switch (opcion)
			{
				case 1:
					System.out.println("1.- Atlas ");
					break;
				case 2:
					System.out.println("2.- Bajas ");
					break;
				case 3: 
					System.out.println("3.- Modificaciones ");
					break;
				case 4:
					System.out.println("4.- Consultas ");
					break;
				case 5: 
					System.out.println("5.- Salir ");
					break;
				default:
					System.out.println("Opcion Erronea");
			} // switch
			System.out.println();
			System.out.println("Introduce Opcion ");
			opcion= teclado.nextInt();
		} //while
		teclado.close();
	}//main
}//class
