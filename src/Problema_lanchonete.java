import java.util.Locale;
import java.util.Scanner;

public class Problema_lanchonete {

	public static void main(String[] args) {
		
		
		/*
		 * Uma lanchonete possui v�rios produtos. Cada produto possui um c�digo e um
		 * pre�o. Voc� deve fazer um programa para ler o c�digo e a quantidade comprada
		 * de um produto (suponha um c�digo v�lido), e da� informar qual o valor a ser
		 * pago, com duas casas decimais, conforme tabela de produtos ao lado.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, qtd;
		double pagar;

		System.out.print("Codigo do produto comprado:");
		codigo = sc.nextInt();

		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();

		pagar = 0;

		if (codigo == 1) {
			pagar = qtd * 5.00;
		} else if (codigo == 2) {
			pagar = qtd * 3.50;
		} else if (codigo == 3) {
			pagar = qtd * 4.80;
		} else if (codigo == 4) {
			pagar = qtd * 8.90;
		} else if (codigo == 5) {
			pagar = qtd * 7.32;
		}

		System.out.printf("Valor a pagar: R$ %.2f\n", pagar);

		sc.close();
	}

}
