package Tanda10;

public class ejercicio3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		var contador = 0;
		int par=0, impar=0;
		for(numero=1;contador<200;) {
			if(numero%2==0) {
				par = par + numero;
			}else
				impar = impar + numero;
			numero=numero+1;
			contador=contador+1;
		}
		System.out.println("La suma de los pares es " + par);
		System.out.println("La suma de los impares es " + impar);
	}		
}
