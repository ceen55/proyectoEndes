package Tanda7;
import java.util.*;
public class ejercicio3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primero, segundo, tercero;
		Scanner teclado;
		teclado = new Scanner (System.in);
		System.out.println("Introduce el primer numero");
		primero = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		segundo = teclado.nextInt();
		System.out.println("Introduce el tercer numero");
		tercero = teclado.nextInt();
		if ((primero > segundo)&&(primero > tercero)){
			System.out.println("El primer número es mayor");
		}else
			if ((segundo > primero)&&(segundo > tercero)) {
				System.out.println("El segundo numero es mayor");
			}else
				if ((tercero > primero)&&(tercero > segundo)) {
					System.out.println("El tercer numero es mayor");
				}else
					System.out.println("Los tres números coinciden");	
		teclado.close();
	}

}
