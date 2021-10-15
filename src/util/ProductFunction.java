package util;

import java.util.function.Function;

import model.entities.Product;

public class ProductFunction implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
