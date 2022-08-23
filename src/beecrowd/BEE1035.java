package beecrowd;

import java.util.Locale;
import java.util.Scanner;

/**
 * Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D
 * for maior do que A, e a soma de C com D for maior que a soma de A e B e se C
 * e D, ambos, forem positivos e se a vari�vel A for par escrever a mensagem
 * "Valores aceitos", sen�o escrever "Valores nao aceitos".
 */
public class BEE1035 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		if ((B > C) && (D > A) && (C + D > A + B) && (C > 0 && D > 0) && (A % 2 == 0)) {

			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores n�o aceitos");
		}

		sc.close();
	}

}
