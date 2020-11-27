package Tanda7;
import java.util.*;
public class ejercicio3_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		teclado = new Scanner (System.in);
		int primero, segundo, tercero;
		System.out.println("Introduce el primer numero");
		primero = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		segundo = teclado.nextInt();
		System.out.println("Introduce el tercer numero");
		tercero = teclado.nextInt();
		if ((primero == segundo)&&(primero == tercero)) {
			System.out.println("Los tres números son iguales");
		}else
			if (primero == segundo) {
				System.out.println("El primero número es igual al segundo número");
			}else
				if (primero == tercero) {
					System.out.println("El primero número es igual al tercer número");
				}else
					if (segundo == tercero) {
						System.out.println("El segundo número y el tercer número son iguales");
					}else
						System.out.println("Ningún numero se repite");
		teclado.close();
	}

}
