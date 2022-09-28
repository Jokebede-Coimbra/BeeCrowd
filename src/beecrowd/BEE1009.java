package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BEE1009 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total
		 * de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este vendedor
		 * ganha 15% de comiss�o sobre suas vendas efetuadas, informar o total a receber
		 * no final do m�s, com duas casas decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome = sc.nextLine();
		double salario = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		
		double totalMes =  (totalVendas * 0.15) + salario;
		
		System.out.println("TOTAL = R$ " + String.format("%.2f", totalMes));
		sc.close();
	}

}
