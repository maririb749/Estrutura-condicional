import java.util.Locale;
import java.util.Scanner;

public class Problema_operadora {

	public static void main(String[] args) {

		/*
		 * Uma operadora de telefonia cobra R$ 50.00 por um plano b�sico que d� direito
		 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
		 * custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma
		 * pessoa consumiu, da� mostrar o valor a ser pago.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutos;
		double valor;

		System.out.println("Digite a quantidade de minutos: ");
		minutos = sc.nextInt();

		valor = 50.0;

		if (minutos > 100) {
			valor = valor + (minutos - 100) * 2.0;
		}

		System.out.printf("Valor a pagar: R$ %.2f\n", valor);

		sc.close();

	}

}
