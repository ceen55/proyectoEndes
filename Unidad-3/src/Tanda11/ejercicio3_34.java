package Tanda11;

public class ejercicio3_34 
{
	public static void main(String[] args)
	{
		int nume, conta;
		nume= 1;
		while (nume <= 9)
		{
			conta= 1;
			while (conta <= nume)
			{
				System.out.print(+conta);
				conta++;
			}
			System.out.println();
			nume++;
		}
	}// main
}//class