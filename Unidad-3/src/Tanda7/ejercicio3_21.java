package Tanda7;
import java.util.*;
public class ejercicio3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		teclado = new Scanner (System.in);
		int hora, minutos, segundos;
		System.out.println("Introduce la hora");
		hora = teclado.nextInt();
		System.out.println("Introduce los minutos");
		minutos = teclado.nextInt();
		System.out.println("Introduce los segundos");
		segundos = teclado.nextInt();
		
		if ((segundos < 59)&&(segundos >= 0)&&(minutos >= 0)&&(hora >=0)&&(segundos < 60)&&(minutos < 60)&&(hora < 24)){
			System.out.println("La hora es " +hora +":"+ minutos +":"+(segundos + 1));
		}else
				if ((minutos < 59)&&(segundos >= 0)&&(minutos >= 0)&&(hora >=0)&&(segundos < 60)&&(minutos < 60)&&(hora < 24)) {
					System.out.println("La hora es " + hora +":"+ (minutos + 1) +":"+ (segundos - segundos));
				}else
					if ((hora < 23)&&(segundos >= 0)&&(minutos >= 0)&&(hora >=0)&&(segundos < 60)&&(minutos < 60)&&(hora < 24)) {
						System.out.println("La hora es " + (hora + 1)+":"+(minutos-minutos)+":"+(segundos-segundos));
					}else
						if((hora >= 23)&&(segundos >= 0)&&(minutos >= 0)&&(hora >=0)&&(segundos < 60)&&(minutos < 60)&&(hora < 24)) {
							System.out.println("La hora es " + (hora-hora)+":"+(minutos-minutos)+":"+(segundos-segundos));
						}else
							System.out.println("No entiendo :c");	
		teclado.close();
	}
}