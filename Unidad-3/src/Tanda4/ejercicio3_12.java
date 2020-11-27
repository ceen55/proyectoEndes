package Tanda4;
import java.util.Scanner;

public class ejercicio3_12
{
	public static void main(String[] args)
	{
		final float PI= 3.1416f;
		int opcion;
		double  radio, area, longitud;
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Introduce el radio de la circunferencia: ");
		radio = teclado.nextDouble();
		System.out.println("      MENU ");
		System.out.println("--------------------- ");		
		System.out.println("  1-Calcular area " +
						   "\n  2-Calcular longitud"); 
		System.out.println("¿Que opcion quieres realizar? ");
		opcion = teclado.nextInt();
		switch (opcion)
		{
			case 1:
				area = PI * radio* radio;
				System.out.println("El area de la circunferencia de radio "+radio+
							           " es: "+area);
				break;
			case 2:
				longitud = 2 * PI * radio;
				System.out.println("La longitud de la circunferencia de radio "+radio+
							           " es: "+longitud);
				break;
			default:
				break;
		}//switch		
		teclado.close();			
	}//main
}// class
