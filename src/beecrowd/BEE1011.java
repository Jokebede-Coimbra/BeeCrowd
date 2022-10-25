package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BEE1011 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		// double volume = ((4/3.0) * Math.PI * Math.pow(valor, 3));
		double volume = ((4/3.0) * 3.14159 * Math.pow(valor, 3));
		
		

		System.out.println("VOLUME = " + String.format("%.3f", volume));
		sc.close();
	}

}
