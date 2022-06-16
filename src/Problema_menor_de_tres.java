import java.util.Locale;
import java.util.Scanner;

public class Problema_menor_de_tres {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o
		 * menor dentre os três números lidos. Em caso de empate, mostrar apenas uma
		 * vez.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int p, s, t, menor;

		System.out.print("Primeiro valor: ");
		p = sc.nextInt();

		System.out.print("Segundo valor: ");
		s = sc.nextInt();

		System.out.print("Terceiro valor: ");
		t = sc.nextInt();

		if (p < s && p < t) {
			menor = p;
		}

		else if (p < t) {
			menor = s;
		} else {
			menor = t;

		}

		System.out.printf("MENOR = %d\n", menor);

		sc.close();

	}

}
