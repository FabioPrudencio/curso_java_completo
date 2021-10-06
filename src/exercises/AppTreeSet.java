package exercises;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class AppTreeSet {

	public static void main(String[] args) {
		//Quando se usa o TreeSet é necessário implementar o comparable
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		System.out.println(set.contains(prod));
		
		for (Product p : set) {
			System.out.println(p);
		}
	}

}
