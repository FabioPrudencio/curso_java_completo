package curso_java_completo;

import java.util.Locale;
import java.util.Scanner;

public class EstruturasRepeticao {

	public void executarExemplo() {
		
		estruturaFor();
		//estruturaWhile();
	}

	private void estruturaWhile() {  //recomendado usar while quando não se sabe quantas vezes será repetido
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
	
	private void estruturaFor() { //recomendado utilizar para quando se sabe o número de vezes que vai executar		
		for (int i=4; i>=0; i--) {
			System.out.println("Valor de i: " + i);		
		}		
	}
	

}
