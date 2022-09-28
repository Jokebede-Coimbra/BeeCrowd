package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BEE1009 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total
		 * de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor
		 * ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber
		 * no final do mês, com duas casas decimais.
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
