package Application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Triangle x;
		Triangle y;

		x = new Triangle();
		y = new Triangle();


		System.out.println("Enter the measures of the triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of the triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle X area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Large area: X");
		} else System.out.println("Large area: Y");
	}
}

