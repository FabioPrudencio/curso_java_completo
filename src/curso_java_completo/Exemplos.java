package curso_java_completo;

import java.util.Locale;
import java.util.Scanner;

public class Exemplos {

	public void executarExemplo() {

		expressaoCondicionalTernaria();
		//exemploswitch();
		// exemplosMath();
		// exeomploEntradaDados();
		// exemploCasting();
		// exemploFormatacao();
		// exemploFormatacaoNumero();
		// exemploUnicode();
	}
	
	private void expressaoCondicionalTernaria() {
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;  //se = ?, então = :
	}

	private void exemploswitch() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}

	private void exemplosMath() {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B); // anula o valor negativo
	}

	private void exeomploEntradaDados() {
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println(String.format("Você digitou %s, %d, %2f.", x, y, z));
		sc.close();
	}

	private void exemploCasting() { // conversão explicita de valores
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = (double) a / b;
		System.out.println(resultado);

	}

	private void exemploFormatacao() {
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

	private void exemploFormatacaoNumero() {
		double x = 10.3515795;

		System.out.println(String.format("Valor da variável formatada: %.2f", x)); // duas casas decimais (%n pula a
																					// linha)

		// Para exibir o resultado com formato americano utilizar locale
		Locale.setDefault(Locale.US);
		System.out.println(String.format("Valor da variável formatada: %.2f", x));
	}

	private void exemploUnicode() {
		char unicodeG = '\u0047'; // Unicode da letra G
		System.out.println("testando exemplos unicode " + unicodeG);
	}

}
