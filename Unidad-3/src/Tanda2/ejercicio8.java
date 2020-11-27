package Tanda2;
import java.util.Scanner;

public class ejercicio8 
{
	public static void main(String[] args) 
	{
		String nombre;
		float nota1,nota2,nota3,media;
		Scanner teclado ;
		teclado = new Scanner(System.in);
		System.out.println("Intoduce el nombre de un alumno: ");
		nombre = teclado.nextLine();
		System.out.println("Introduce las notas de "+nombre);
		System.out.println("Nota-1: ");
		nota1 = teclado.nextFloat();
		System.out.println("Nota-2 : ");
		nota2 = teclado.nextFloat();
		System.out.println("Nota-3 : ");
		nota3 = teclado.nextFloat();
		media = (nota1+nota2+nota3)/3;
		teclado.close();
		System.out.println("La nota media de " + nombre+" es: "+ media);
	}//main
}//class
