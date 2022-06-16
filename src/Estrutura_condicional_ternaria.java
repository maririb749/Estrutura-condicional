import java.util.Locale;
import java.util.Scanner;

public class Estrutura_condicional_ternaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		// Estrutura opcional ao if-else quando se deseja decidir um
		//valor com base em uma condicao.
		
		/*double preco = 34.5;
		double desconto ;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}*/
		
		
		
		//simplicar a expressao acima usando uma expressao ternaria
		
		double preco = 34.5;
		double desconto = (preco < 20)? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		
		
		sc.close();

	}

}
