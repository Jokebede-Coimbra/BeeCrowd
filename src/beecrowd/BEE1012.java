package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BEE1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		System.out.println("TRIANGULO: " + String.format("%.3f", (a * c) / 2));
		// System.out.println("CIRCULO:  " + String.format("%.3f", (c * c) * 3.14159));
		System.out.println("CIRCULO:  " + String.format("%.3f", (c * c) * Math.PI));
		System.out.println("TRAPEZIO: " + String.format("%.3f", ((a + b) * c )/ 2));
		System.out.println("QUADRADO: " + String.format("%.3f", b * b));
		System.out.println("RETANGULO: " + String.format("%.3f", a * b));

		sc.close();
	}

}
