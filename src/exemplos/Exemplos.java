package exemplos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.stream.Collectors;

import entities.Product;


public class Exemplos {
	
	//wrapper classes int = Integer, double = Double
	//Encapsulamento - private, public...
	//Sobrecarga mais de um construtor	
	//Heran?as
	//polimorfismo
	//composi??o de entidades = para obter um objeto mais complexo - "tem um" e "tem v?rios" (pedido cont?m itens)
	//composi??o de servi?os

	public void executarExemplo() {
		
		formatandoCalendar();
		//formataDataSimpleDateFormat();
		//listas();		
		//vetorObjeto();
		//vetorPrimitivo();
		//funcoesString();
		//operadorBitWise();
		// expressaoCondicionalTernaria();
		// exemploswitch();
		// exemplosMath();
		// exeomploEntradaDados();
		// exemploCasting();
		// exemploFormatacao();
		// exemploFormatacaoNumero();
		// exemploUnicode();
	}
	
	private void formatandoCalendar() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		//Date orderDateAux = Date.from(Instant.parse("2021-07-19T14:56:37.227"));
		//Date orderDateAux =   Date.from(Instant.parse("2021-07-19T14:56:37Z"));
		
		System.out.println("d: " + d);
		
		//System.out.println("orderDateAux: " + orderDateAux);
		
		System.out.println(sdf.format(d));
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.MONTH, -11); //Adicionando 3 meses
		
		System.out.println(calendar.toInstant());
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4); //Adicionando 4 horas
		int minutes = cal.get(Calendar.MINUTE);  //Pegando minutos ho hor?rio
		int month = 1 + cal.get(Calendar.MONTH); //Pegando o mes (? adicionado "um" porque o n?mero de meses come?a no zero)
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}
	
	private void formataDataSimpleDateFormat () {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		//sdf3.setTimeZone(TimeZone.getTimeZone("UTC"));
			
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = new Date();
		Date y2 = new Date();
		Date y3 = new Date();
		try {
			y1 = sdf1.parse("25/06/2018");
		    y2 = sdf2.parse("25/06/2018 15:42:07");
		    y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //Padr?o ISO 8601 e classe Instant
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//Instant.
		String dateInstant = String.valueOf(x1.toInstant());
		System.out.println(dateInstant);
		System.out.println("x1 to Instant: " + x1.toInstant());
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("------------------");		
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("------------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
	}
	
	private void listas() {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Anderson");
		list.add("Jessie");
		list.add("Bob");
		list.add("Giulia");
		list.add("Rafael");
		list.add("Anna");
		
		list.add(2, "Marco"); //Adiciona na posi??o 2		
		
		System.out.println(list.size());
		for (String str : list) {
			System.out.println(str);
		}
		
		list.remove("Anderson"); //Remover Anna
		list.remove(6); // Remover na posi??o 1
		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println("------------------------------");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());		
		for (String str : result) {
			System.out.println(str);
		}
		System.out.println("------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);		
	}
	
	private void vetorObjeto() {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		double sum = 0;
		for (int i=0; i < vect.length ;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();		
	}	
	
	private void vetorPrimitivo() {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0;
		for (int i=0;i<vect.length;i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double avg = sum / vect.length;		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);		
		sc.close();
	}	
		
	//Funcoes interessantes para Strings
	private void funcoesString() {
	//Formatar: toLowerCase(), toUpperCase(), trim()
		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();		
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		//Recortar: substring(inicio), substring(inicio, fim)
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		//Substituir: Replace(char, char), Replace(string, string)
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		//Buscar: IndexOf, LastIndexOf
		int i = original.indexOf("bc"); //pega a primeira ocorr?ncia dos caracteres
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		//Dividir uma string por um separadador str.Split(";")		
		String s = "potato;apple;lemon";
		String[] vect = s.split(";");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		
	}

	private void operadorBitWise() {
		
		//int n1 = 89;
		//int n2 = 60;
		//System.out.println(n1 & n2);
		//System.out.println(n1 | n2);
		//System.out.println(n1 ^ n2);		
		
		
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		int n = sc.nextInt();
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false");
		}
		sc.close();
	}

	private void expressaoCondicionalTernaria() {
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05; // se = ?, ent?o = :
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
		System.out.println(String.format("Voc? digitou %s, %d, %2f.", x, y, z));
		sc.close();
	}

	private void exemploCasting() { // convers?o explicita de valores
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

		System.out.println(String.format("Valor da vari?vel formatada: %.2f", x)); // duas casas decimais (%n pula a
																					// linha)

		// Para exibir o resultado com formato americano utilizar locale
		Locale.setDefault(Locale.US);
		System.out.println(String.format("Valor da vari?vel formatada: %.2f", x));
	}

	private void exemploUnicode() {
		char unicodeG = '\u0047'; // Unicode da letra G
		System.out.println("testando exemplos unicode " + unicodeG);
	}

}
