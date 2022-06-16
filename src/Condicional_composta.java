import java.util.Scanner;

public class Condicional_composta {

	public static void main(String[] args) {
		// V executa somente o bloco if
		// F executa somente o bloco else

		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		}

		else {
			System.out.println("Boa tarde");
		}

		sc.close();

	}

}
