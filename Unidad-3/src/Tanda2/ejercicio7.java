package Tanda2;
import java.util.*;
public class ejercicio7 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in)) {
			int x;
System.out.println("Precio:");
x = teclado.nextInt();
double IVA = x*0.10;
System.out.println("IVA: " + IVA);
double Descuento = x*0.15;
System.out.println("Descuento:" + Descuento);
double PrecioF = x + IVA - Descuento;
System.out.println("Precio final: " + PrecioF);
		}
		
	}

}
