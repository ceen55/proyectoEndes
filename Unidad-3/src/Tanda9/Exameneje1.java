package Tanda9;
import java.util.*;
public class Exameneje1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int edad=1, mediajo=0, media;
		for(edad=1;edad>0;) {
			System.out.println("Introduzca edad (0 para finalizar)");
			edad=teclado.nextInt();
		if(edad<=18) {
			mediajo=edad+edad;
		}
		System.out.println(+mediajo);
		}
		
	}

}
