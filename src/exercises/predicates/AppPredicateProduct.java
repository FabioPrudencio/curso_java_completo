package exercises.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import model.entities.Product;

public class AppPredicateProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));

		// list.removeIf(new ProductPredicate()); //Implementa��o da interface
		// list.removeIf(Product::staticProductPredicate); //Reference Method com m�todo est�tico
		// list.removeIf(Product::nonStaticProductPredicate); //Reference Method com m�todo n�o est�tico

		// Predicate<Product> pred = p -> p.getPrice() >= 100.0; //Express�o lambda declarada
		// list.removeIf(pred);

		list.removeIf(p -> p.getPrice() >= 100.0); // Express�o lambda in-line

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
