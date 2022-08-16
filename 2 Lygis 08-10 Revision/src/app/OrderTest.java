package app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class OrderTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void makeOrderExceptionTest() {
		Product product1 = new Product("Varske", 1.49, "07886659844", 6);
		List<Product> productList = new ArrayList<>(Arrays.asList(product1));
		Shop shopTest = new Shop("Iki", "Petro g. 50", productList);

		Order order = new Order("1-LT", null, null);
		HashMap<String, Integer> prod = new HashMap<>() {
			{
				put("07886659844", 8);
			}
		};
		assertThrows(InsufficientProductException.class, () -> order.makeOrder(shopTest, Type.SALE, prod), "Insufficient amount of product to sell");

	}

}
