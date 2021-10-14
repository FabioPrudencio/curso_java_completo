package util;

import java.util.function.Consumer;

import model.entities.Product;

public class ProductConsumer implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}