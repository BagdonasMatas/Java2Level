package app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ProductTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void importProductsTest() {
		Product product1 = new Product("Varske", 1.49, "07886659844", 6);
		Product product2 = new Product("Suris", 6.85, "06669844723", 2);
		Product product3 = new Product("Cola", 2.19, "06998454541", 50);
		Product product4 = new Product("Alus", 1.89, "0984451274", 17);
		Product product5 = new Product("Vistienos kepsniai", 5.19, "96665644256", 12);
		
		List<Product> productList = new ArrayList<>(Arrays.asList(product1, product2, product3, product4, product5));
		
		List<Product> productListTesting = Product.importProducts();
		
		
		//assertTrue(productList.containsAll(productListTesting));
		
		assertEquals(productList, productListTesting);

	}

}
