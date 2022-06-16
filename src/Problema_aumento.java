import java.util.Locale;
import java.util.Scanner;

public class Problema_aumento {

	public static void main(String[] args) {
		

		/*
		 * Uma empresa vai conceder um aumento percentual de sal�rio aos seus
		 * funcion�rios dependendo de quanto cada pessoa ganha, conforme tabela ao lado.
		 * Fazer um programa para ler o sal�rio de uma pessoa, da� mostrar qual o novo
		 * sal�rio desta pessoa depois do aumento, quanto foi o aumento e qual foi a
		 * porcentagem de aumento.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, novosalario, aumento;
		int porcentagem;

		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();

		if (salario <= 1000.00) {
			porcentagem = 20;
			aumento = salario * porcentagem / 100;
			novosalario = salario + aumento;
		}

		else if (salario <= 3000.00) {
			porcentagem = 15;
			aumento = salario * porcentagem / 100;
			novosalario = salario + aumento;
		} else if (salario <= 8000.00) {
			porcentagem = 10;
			aumento = salario * porcentagem / 100;
			novosalario = salario + aumento;
		} else {
			porcentagem = 5;
			aumento = salario * porcentagem / 100;
			novosalario = salario + aumento;
		}
		
		
		System.out.printf("Novo salario = R$ %.2f\n", novosalario);
		System.out.printf("Aumento = R$ %.2f\n", aumento);
		System.out.printf("Porcentagem = R$ %d %%\n", porcentagem);

		sc.close();

	}

}
