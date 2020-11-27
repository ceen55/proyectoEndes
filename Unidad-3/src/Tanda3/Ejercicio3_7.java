package Tanda3;

import java.util.Scanner;

public class Ejercicio3_7 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in)) {
			int a, b, c, x, y;
			double raiz;
			
			System.out.println("Introducir a");
			a = teclado.nextInt();
			System.out.println("Introducir b");
			b = teclado.nextInt();
			System.out.println("Introducir c");
			c = teclado.nextInt();
			raiz = Math.sqrt((b*b)-(4*a*c));
			x = (int) ((-b - raiz ) / (2 * a));
			y = (int) ((-b + raiz ) / (2 * a));
			System.out.println("El primer resultado de la ecuación de segundo grado es " + x);
			System.out.println("El segundo resultado de la ecuación de segundo grado es " + y);
		}
	}
}