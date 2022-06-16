import java.util.Scanner;

public class Estrutura_condicional_simples {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = 5;

		System.out.println("Bom dia");

		if (x < 0) {
			System.out.println("Boa tarde");
		}

		System.out.println("Boa noite");

		sc.close();

	}

}
