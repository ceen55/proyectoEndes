package EjercicosTeoria;
import java.util.*;
public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int notaEntera;
			System.out.println("");
			System.out.println("Aplicación para la conversión de notas enteras a literales alfabéticos");
			System.out.println("");
			Scanner teclado;
			teclado = new Scanner (System.in);
			System.out.println ("Introduce la Nota numérica a convertir: ");
			notaEntera = teclado.nextInt();
			switch (notaEntera) {
			case 0:
			case 1:
			case 2:
			System.out.println("Muy Deficiente");
			break;
			case 3:
			case 4:
			System.out.println("Insuficiente");
			break;
			case 5:
			System.out.println("Suficiente");
			break;
			case 6:
			System.out.println("Bien");
			break;
			case 7:
			case 8:
			System.out.println("Notable");
			break;
			case 9:
			System.out.println("Sobresaliente");
			break;
			case 10:
			System.out.println("Matrícula de Honor");
			break;
			default:
			System.out.println("Nota errónea: Sólo son notas válidas los números enteros del 0 al 10");
			}
			System.out.println(""); System.out.println("");
			teclado.close();
			}
	}
