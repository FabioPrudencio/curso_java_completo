package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class EstruturasRepeticao {

	public void executarExemplo() {

		estruturaDoWhile();
		// estruturaFor();
		// estruturaWhile();
	}

	private void estruturaDoWhile() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		sc.close();

	}

	private void estruturaWhile() { // recomendado usar while quando não se sabe quantas vezes será repetido
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma = 0;
		while (x != 0) {
			x = sc.nextInt();
			soma += x;
		}
		sc.close();
		System.out.println("reultado da Soma " + soma);
	}

	private void estruturaFor() { // recomendado utilizar para quando se sabe o número de vezes que vai executar
		for (int i = 4; i >= 0; i--) {
			System.out.println("Valor de i: " + i);
		}
	}

	private void estruturaForEach() {
		String[] vect = new String[] { "Maria", "Bob", "Alex" };
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
