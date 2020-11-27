package Tanda4;
import java.util.Scanner;

public class ejercicio3_11
{
	public static void main(String[] args)
	{
		int opcion;
		double nume1, nume2, resultado;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		nume1= teclado.nextDouble();
		System.out.println("Introduce el segundo número: ");
		nume2= teclado.nextDouble();
		System.out.println("      MENU ");
		System.out.println("--------------------- ");
		System.out.println("  1- SUMAR " +
				           "\n  2- RESTAR" +
				           "\n  3- MULTIPLICAR" +
				           "\n  4- DIVIDIR");
		System.out.println("¿Que opcion quieres realizar? ");
		opcion = teclado.nextInt();
		switch (opcion) {
		case 1:
			resultado= nume1 + nume2;
			System.out.println("La suma de "+ nume1+ " y " +nume2+ " es: " + resultado);
			break;
		case 2:
			resultado= nume1 - nume2;
			System.out.println("La resta de "+ nume1+ " y " +nume2+ " es: " + resultado);
			break;
		case 3:
			resultado= nume1 * nume2;
			System.out.println("La multiplicacion de "+ nume1+ " y " +nume2+ " es: " + resultado);
			break;
		case 4:
			resultado= nume1 / nume2;
			System.out.println("La división de "+ nume1+ " y " +nume2+ " es: " + resultado);
			break;	
		default:
			break;
		}//switch	
		teclado.close();
	}//main
}// class
