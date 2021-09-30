package exercises;

import entities.Client;

public class AppHashCodeEquals {
	
	public static void main(String[] args) {
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		Client c3 = new Client("Alex", "alex@gmail.com");
		
		String st1 = "Teste";
		String st2 = "Teste";
		String st3 = new String("Teste");
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		System.out.println(c2 == c3);
		System.out.println("--------------");
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
	}
	
}
