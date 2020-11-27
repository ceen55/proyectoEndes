package Tanda4;
import java.util.Scanner;

public class ejercicio3_10
{
	public static void main(String[] args) 
	{
		char respuesta;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Quieres continuar (s/n) ");
		respuesta = teclado.next().charAt(0);
		if ((respuesta== 's')||(respuesta== 'n')||(respuesta=='S')||(respuesta=='N'))
			System.out.println("La respuesta es correcta y es "+respuesta);
		else
		{
			System.out.print("La respuesta es erronea, no es ni s ni n ni S ni N,");
			System.out.println(" has introducido "+respuesta);
		}
		teclado.close();
	}

}
