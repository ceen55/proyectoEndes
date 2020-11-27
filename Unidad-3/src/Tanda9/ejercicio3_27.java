package Tanda9;
import java.util.*;
public class ejercicio3_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		teclado = new Scanner (System.in);
			  int contador = 2;
			  int numero;
			  System.out.println("Introduce un número");
			  numero = teclado.nextInt();
			  boolean primo=true;
			  while((primo) && (contador!=numero)){
			    if (numero % contador == 0)
			      primo = false;
			    contador++;
			  }
			  if(primo == false) {
				  System.out.println("No es primo");
			  }else {
				  System.out.println("Es primo");
			  }
		teclado.close();
	}
}