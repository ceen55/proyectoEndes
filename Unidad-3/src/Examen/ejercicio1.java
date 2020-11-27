package Examen;
import java.util.*;
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		teclado = new Scanner (System.in);
		int primero, segundo;
		System.out.println("Escribe el primer número");
		primero = teclado.nextInt();
		System.out.println("Escribe el segundo número");
		segundo = teclado.nextInt();
		if(primero > segundo) {
			System.out.println("La resta del mayor menos el menor es " + (primero - segundo) );
		}else
			System.out.println("La resta del mayor menos el menor es " + (segundo - primero));
		
		
		
		teclado.close();
	}

}
