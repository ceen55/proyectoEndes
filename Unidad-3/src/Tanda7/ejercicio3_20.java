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
			System.out.println("Los tres n�meros son iguales");
		}else
			if (primero == segundo) {
				System.out.println("El primero n�mero es igual al segundo n�mero");
			}else
				if (primero == tercero) {
					System.out.println("El primero n�mero es igual al tercer n�mero");
				}else
					if (segundo == tercero) {
						System.out.println("El segundo n�mero y el tercer n�mero son iguales");
					}else
						System.out.println("Ning�n numero se repite");
		teclado.close();
	}

}
