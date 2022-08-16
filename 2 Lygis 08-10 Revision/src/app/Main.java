package app;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Product> products = Product.importProducts();
		
		for(Product p : products) {
			System.out.println(p.getName());
			System.out.println(p.getPrice());
			System.out.println(p.getBarcode());
			System.out.println(p.getRemainder());
		}
		
	}

}
