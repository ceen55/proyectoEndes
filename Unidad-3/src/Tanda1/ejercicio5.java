package Tanda1;
import java.util.*;
public class ejercicio5 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in)) {
			int x, y;
			System.out.println("Introducir primer n�mero");
			x = teclado.nextInt();
			System.out.println("Introducir segundo n�mero");
			y = teclado.nextInt();
			System.out.println("La suma de los cuadrados es " + (x*x + y*y));
		}
	}
}