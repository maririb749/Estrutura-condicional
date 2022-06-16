import java.util.Locale;
import java.util.Scanner;

public class Problema_multiplus {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler dois n�meros inteiros, e dizer se um n�mero �
		 * m�ltiplo do outro. Os n�meros podem ser digitados em qualquer ordem.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("Digite dois numeros inteiros: ");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();

		if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("S�o multiplos");
		} 
		else {
			System.out.println("Nao sao multiplos");
		}

		sc.close();

	}

}
