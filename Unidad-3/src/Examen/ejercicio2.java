package Examen;
import java.util.*;
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		teclado = new Scanner (System.in);
		int primero, segundo, tercero;
		System.out.println("Escribe el primer n�mero");
		primero = teclado.nextInt();
		System.out.println("Escribe el segundo n�mero");
		segundo = teclado.nextInt();
		System.out.println("Escribe el tercer n�mero");
		tercero = teclado.nextInt();
		if(primero + segundo == tercero) {
			System.out.println("Cumple la condici�n");
		}else
			if(segundo + tercero == primero) {
				System.out.println("Cumple la condici�n");
			}else 
				if(primero + tercero == segundo) {
					System.out.println("Cumple la condici�n");
				}else
					System.out.println("No cumple la condici�n");
		
		teclado.close();
	}

}
