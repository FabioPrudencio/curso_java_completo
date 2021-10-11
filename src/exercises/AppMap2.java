package exercises;

import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class AppMap2 {

	public static void main(String[] args) {

		Map<Product, Double> stock = new TreeMap<>();

		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);

		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
