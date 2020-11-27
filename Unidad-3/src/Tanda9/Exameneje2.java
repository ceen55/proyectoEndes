package Tanda9;
import java.util.*;
public class Exameneje2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int  num ,num1=0, num2=0 ,num3;
		System.out.println("Introduzca un numero");
		num=teclado.nextInt();
		System.out.println("Introduzca otro numero");
		num2=teclado.nextInt();
		num3=num2;
		if(num1<num2 || num2<num1) {
		for(num1=num;num1<num2;++num1) {
			System.out.print(+num1+"-"); }}
		for(num2=num3;num2<=num1;--num1) {
			System.out.print(+num1+"-");
		}
		teclado.close();
	}

}
