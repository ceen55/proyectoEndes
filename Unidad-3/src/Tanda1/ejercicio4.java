package Tanda1;
import java.util.*;
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner teclado = new Scanner (System.in)) {
			int x , y;
			System.out.println("Introduce el base: ");
			x = teclado.nextInt();
			System.out.println("Introduce el altura: ");
			y = teclado.nextInt();
			System.out.println("El área del rectángulo tiene un valor de: " + (x*y));
		}
	}
}
