package EjercicosTeoria;
import java.util.*;
public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int notaEntera;
			System.out.println("");
			System.out.println("Aplicaci�n para la conversi�n de notas enteras a literales alfab�ticos");
			System.out.println("");
			Scanner teclado;
			teclado = new Scanner (System.in);
			System.out.println ("Introduce la Nota num�rica a convertir: ");
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
			System.out.println("Matr�cula de Honor");
			break;
			default:
			System.out.println("Nota err�nea: S�lo son notas v�lidas los n�meros enteros del 0 al 10");
			}
			System.out.println(""); System.out.println("");
			teclado.close();
			}
	}
