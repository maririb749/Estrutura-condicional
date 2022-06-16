import java.util.Locale;
import java.util.Scanner;

public class Problema_glicose {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa e
		 * depois mostrar na tela a classificação desta glicose de acordo com a tabela
		 * de referência ao lado.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double glicose;

		System.out.println("Digite a medida da glicose: ");
		glicose = sc.nextDouble();

		System.out.printf("Classificacao: ");

		if (glicose <= 100) {
			System.out.println("normal");

		} 
		else if (glicose <= 140) {
			System.out.println("elevado");
		} 
		else {
			System.out.println("diabetes");
		}

		sc.close();
	}
}
