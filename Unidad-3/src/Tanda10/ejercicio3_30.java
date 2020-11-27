package Tanda10;
import java.util.Scanner;

public class ejercicio3_30
{
	public static void main(String[] args)
	{
		int numero,mayor= 0;
		Scanner teclado;
		teclado= new Scanner(System.in);
		System.out.println("Introduce un numero entero positivo distinto de 0 " +
				         "(Para terminar Introduce -99): ");
		numero = teclado.nextInt();
		while (numero<0 && numero != -99) {
			System.out.println("NUMERO NO VALIDO: \n "+
					"Introduce un numero entero positivo distinto de 0 " +
	                "(Para terminar Introduce -99): ");
			numero = teclado.nextInt();
		}//while
		while (numero != -99) 
		{
			if (numero >= mayor)
				mayor= numero;				
				
			System.out.println("Introduce un numero entero positivo distinto de 0 " +
	                          "(Para terminar Introduce -99): ");
            numero = teclado.nextInt();
            while (numero<0 && numero != -99)
            {
                      System.out.println("NUMERO NO VALIDO: \n "+
		              "Introduce un numero entero positivo distinto de 0 " +
                      "(Para terminar Introduce -99): ");
                      numero = teclado.nextInt();
             }//while
		}//while
		teclado.close();
		System.out.println("El mayor de la serie es: "+mayor);
	}
}