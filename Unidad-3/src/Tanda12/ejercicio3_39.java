package Tanda12;
import java.util.Scanner;

public class ejercicio3_39 {

	public static void main(String[] args)
	{
		int contavocal= 0;
		char letra;
		Scanner teclado;
		teclado= new Scanner(System.in);
		System.out.println("Introduce 10 letras ");
		for (int i= 0; i< 10; i++)
		{
			letra= teclado.next().charAt(0);
			switch (letra)
			{
				case 'a':
					contavocal++;
					break;
				case 'e':
					contavocal++;
					break;
				case 'i':
					contavocal++;
					break;
				case 'o':
					contavocal++;
					break;
				case 'u':
					contavocal++;
					break;
				default:
					break;
			}//switch
		}//for
		teclado.close();
		System.out.println("El numero de vocales es "+contavocal);	
	}//main
}// class
