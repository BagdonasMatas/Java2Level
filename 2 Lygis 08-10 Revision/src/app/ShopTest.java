package app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ShopTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void sortByNameTest() {
		Shop shop1 = new Shop("Iki", "San 12", null);
		Shop shop2 = new Shop("Rimi", "San 12", null);
		Shop shop3 = new Shop("AAAAAAAA", "San 12", null);
		Shop shop4 = new Shop("ZZZZ", "San 12", null);
		
		List<Shop> shopsTest = new ArrayList<Shop>();
		shopsTest.add(shop1);
		shopsTest.add(shop2);
		shopsTest.add(shop3);
		shopsTest.add(shop4);
		
		List<Shop> sortedManuallyShops = new ArrayList<Shop>();
		sortedManuallyShops.add(shop3);
		sortedManuallyShops.add(shop1);
		sortedManuallyShops.add(shop2);
		sortedManuallyShops.add(shop4);
		
		
		List<Shop> sortedShopsTest = Shop.sortByName(shopsTest);
		
		assertEquals(sortedManuallyShops, sortedShopsTest);
	}

	@Test
	void shopBalanceTest() {
	
	Product product1 = new Product("Varske", 1.49, "07886659844", 6);
	Product product2 = new Product("Suris", 6.85, "06669844723", 2);
	Product product3 = new Product("Cola", 2.19, "06998454541", 50);
	Product product4 = new Product("Alus", 1.89, "0984451274", 17);
	Product product5 = new Product("Vistienos kepsniai", 5.19, "96665644256", 12);
	
	List<Product> productList = new ArrayList<>(Arrays.asList(product1, product2, product3, product4, product5));
	
	Shop shop1 = new Shop("Iki", "San 12", productList);
	
	String decimalsFix = String.format("%.2f",shop1.shopBalance());
	
	assertEquals("226,55", decimalsFix);
	}
}
