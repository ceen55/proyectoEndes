package Examen;
import java.util.*;
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		teclado = new Scanner (System.in);
		int primero, segundo, tercero;
		System.out.println("Escribe el primer número");
		primero = teclado.nextInt();
		System.out.println("Escribe el segundo número");
		segundo = teclado.nextInt();
		System.out.println("Escribe el tercer número");
		tercero = teclado.nextInt();
		if(primero + segundo == tercero) {
			System.out.println("Cumple la condición");
		}else
			if(segundo + tercero == primero) {
				System.out.println("Cumple la condición");
			}else 
				if(primero + tercero == segundo) {
					System.out.println("Cumple la condición");
				}else
					System.out.println("No cumple la condición");
		
		teclado.close();
	}

}
