package Tanda5;
import java.util.Scanner;

public class ejercicio3_13
{
	public static void main(String[] args)
	{
		int dia;
		Scanner teclado;
		teclado= new Scanner(System.in);
		System.out.println("Introduce un número de día: ");
		dia= teclado.nextInt();
		switch (dia)
		{
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sabado");
				break;	
			case 7:
				System.out.println("Domingo");
				break;		
			default:
				System.out.println("Número de día erronea");
				break;
		}//switch	
		teclado.close();
	}//main
}// class
