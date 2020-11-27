package Tanda12;
import java.util.Scanner;

public class ejercicio3_40
{
	public static void main(String[] args) 
	{
		int conta= 0;
		char letra, primero='a';
		Scanner teclado;
		teclado= new Scanner(System.in);
		System.out.println("Introduce 10 caracteres ");
		for (int i= 0; i< 10; i++)
		{
			letra= teclado.next().charAt(0);
			if (i== 0)
			{
				primero= letra;
				conta++;
			}
			else
				if (letra== primero)
					conta++;
		}//for
		teclado.close();
		System.out.println("El caracter "+primero+" se repite "+conta+" veces");
	}//main
}//class

