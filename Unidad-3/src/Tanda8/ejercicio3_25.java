package Tanda8;
import java.util.*;
public class ejercicio3_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		teclado = new Scanner (System.in);
		int numero;
		int contador = 0;
		System.out.println("Teclea un n�mero");
		numero = teclado.nextInt();
		while(numero != 0) {
			System.out.println("Su n�mero es " + numero);
			contador = contador + 1;
			System.out.println("Los n�meros que has introducido distintos de cero son " + contador);
			System.out.println("Teclea un n�mero");
			numero = teclado.nextInt();
		}
		System.out.println("La cantidad de numeros que has introducido diferentes de cero es " + contador );
		
		
		teclado.close();
		}
	}