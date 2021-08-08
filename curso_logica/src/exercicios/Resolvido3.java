package exercicios;

import java.util.Scanner;

public class Resolvido3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String nome1 = scan.next();
		int idade1 = scan.nextInt();
		String nome2 = scan.next();
		int idade2 = scan.nextInt();
		double mediaIdade = (double) (idade1 + idade2) / 2;

		System.out.printf("A idade média de %s e %s é de %.1f anos\n", nome1, nome2, mediaIdade);
		
		
		scan.close();
	}
}
