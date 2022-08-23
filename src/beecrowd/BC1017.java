package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BC1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tempoH;
		int velocM;
		int distancia;
		double consumo;

		tempoH = sc.nextInt();
		velocM = sc.nextInt();

		distancia = tempoH * velocM;
		consumo = distancia / 12.0;
		System.out.println(String.format("%.3f", consumo));

		sc.close();
	}

}
