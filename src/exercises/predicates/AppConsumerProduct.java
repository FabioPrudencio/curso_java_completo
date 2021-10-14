package exercises.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import model.entities.Product;

public class AppConsumerProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));

		// list.forEach(new ProductConsumer()); //Implementa��o da interface
		// list.forEach(Product::staticPriceUpdate); //Reference method com m�todo est�tico
		// list.forEach(Product::nonStaticPriceUpdate);//Reference method com m�todo n�o est�tico
		
		// Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1); //Express�o lambda declarada
		// list.forEach(cons);

		list.forEach(p -> p.setPrice(p.getPrice() * 1.1)); //Express�o lambda inline

		list.forEach(System.out::println);

	}

}
