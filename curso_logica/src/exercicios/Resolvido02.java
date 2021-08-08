package exercicios;

import java.util.Scanner;

public class Resolvido02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double base = scan.nextDouble();
		double altura = scan.nextDouble();

		double area = base * altura;
		double perimetro = 2 * (base + altura);
		double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

		System.out.printf("AREA = %.4f\n", area);
		System.out.printf("PERIMETRO = %.4f\n", perimetro);
		System.out.printf("DIAGONAL = %.4f\n", diagonal);

		scan.close();
	}
}
