import java.util.Locale;
import java.util.Scanner;

public class Problema_tempo_de_jogo {

	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do
		 * jogo, sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo
		 * uma dura��o m�nima de 1 hora e m�xima de 24 horas.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horainicial, horafinal;

		System.out.print("Hora inicial: ");
		horainicial = sc.nextInt();

		System.out.print("Hora final: ");
		horafinal = sc.nextInt();

		if (horainicial < horafinal) {
			System.out.printf("O JOGO DUROU %d HORA(s)\n", horafinal - horainicial);
		} 
		else {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", 24 - (horainicial - horafinal));
		}

		sc.close();

	}

}
