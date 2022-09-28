package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BEE1010 {

	public static void main(String[] args) {
		/*
		 * Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o
		 * valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e
		 * o valor unit�rio de cada pe�a 2. Ap�s, calcule e mostre o valor a ser pago.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1 = sc.nextInt();
		int numero1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int numero2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double total = (valor1 * numero1) + (valor2 * numero2);

		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));
		sc.close();
	}

}
