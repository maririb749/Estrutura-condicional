import java.util.Locale;
import java.util.Scanner;

public class Escolpo_inicializacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/* em java uma variavel nao pode ser usada se ela nao for iniciada */

		double price = 400.00;
		double discount;

		if (price < 200.00) {
			discount = price * 0.1;
		} else {
			discount = 0;
		}

		System.out.println(discount);

		sc.close();

	}

}
