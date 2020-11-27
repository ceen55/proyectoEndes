package Examen;
import java.util.*;
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		teclado = new Scanner (System.in);
		int paso;
		System.out.println("Escribe la cantidad de pasos");
		paso = teclado.nextInt();
		if((paso <= 1000)&&(paso > 0)){
			System.out.println("El valor de la factura es " + (paso * 0.10));
		}else 
			System.out.println("El valor de la factura es " + ((paso * 0.10)* 0.18));
		
		teclado.close();
	}

}
