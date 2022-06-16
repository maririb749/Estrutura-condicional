import java.util.Locale;
import java.util.Scanner;

public class Sintax_opcional_atribuicao_cumulativa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();

		// ler o valor da conta

		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2;
			// conta = conta + (minutos - 100) * 2.0;
		}

		System.out.printf("Valor da conta = R$ %.2f%n", conta);

		sc.close();

	}

}
