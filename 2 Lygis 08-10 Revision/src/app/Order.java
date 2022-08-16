package app;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
	private String orderNr;
	private HashMap<String, Integer> orderedProducts;
	private Type orderType;

	public Order(String orderNr, HashMap<String, Integer> orderedProducts, Type orderType) {
		this.orderNr = orderNr;
		this.orderedProducts = orderedProducts;
		this.orderType = orderType;
	}

	public String getOrderNr() {
		return orderNr;
	}

	public void setOrderNr(String orderNr) {
		this.orderNr = orderNr;
	}

	public HashMap<String, Integer> getOrderedProducts() {
		return orderedProducts;
	}

	public void setOrderedProducts(HashMap<String, Integer> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}

	public Type getOrderType() {
		return orderType;
	}

	public void setOrderType(Type orderType) {
		this.orderType = orderType;
	}

	public static List<Order> filerOrderByType(List<Order> orders, Type type) {
		List<Order> filteredOrders = orders.stream().filter(ord -> ord.getOrderType().equals(type))
				.collect(Collectors.toList());

		return filteredOrders;
	}

	public void makeOrder(Shop shop, Type orderType, HashMap<String, Integer> order) throws InsufficientProductException {

		if (orderType.equals(Type.PURCHASE)) {
			List<Product> products = shop.getProducts();

			for (String bar : order.keySet()) {
				for (int i = 0; i < products.size(); i++) {
					Product prod = products.get(i);
					if (prod.getBarcode().equals(bar)) {
						prod.setRemainder((prod.getRemainder() + order.get(bar)));
						products.set(i, prod);
						break;
					} else if (i == products.size() - 1) {
						System.out
								.println("No item with such a barcode in the shop database. Contanct your supervisor.");
					}
				}
			}
			shop.setProducts(products);

		} else {
			List<Product> products = shop.getProducts();

			for (String bar : order.keySet()) {
				for (int i = 0; i < products.size(); i++) {
					Product prod = products.get(i);
					if (prod.getBarcode().equals(bar)) {
						if(prod.getRemainder() < order.get(bar)) throw new InsufficientProductException("Insufficient amount of product to sell", prod.getRemainder());
						else {
						prod.setRemainder((prod.getRemainder() - order.get(bar)));
						products.set(i, prod);
						break;
						}
					} else if (i == products.size() - 1) {
						System.out
								.println("No item with such a barcode in the shop database. Contanct your supervisor.");
					}
				}
			}
			shop.setProducts(products);

		}
	}

}
