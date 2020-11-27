package Tanda9;
import java.util.*;
public class Exameneje3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		float altura ,peso, imc;
		System.out.println("Introduzca altura");
		altura=teclado.nextFloat();
		System.out.println("Introduzca peso");
		peso=teclado.nextFloat();
		imc=peso/(altura*altura);
		System.out.println("IMC:"+imc);
		if(imc<16) {
		System.out.println("Ingreso en hospital");
	}
		if(imc>=16 && imc<17) {
			System.out.println("Infrapeso");
		}
		if(imc>=18 && imc<25) {
			System.out.println("Peso Normal");
		}
		if(imc>=25 && imc<30) {
			System.out.println("Obesidad grado I");
		}
		if(imc>=30 && imc<35) {
			System.out.println("Obesidad grado II");
		}
		if(imc>=35 && imc<40) {
			System.out.println("Obesidad grado III");
		}
		if(imc>=40) {
			System.out.println("Obesidad grado IV");
		}
		teclado.close();
	}
}
