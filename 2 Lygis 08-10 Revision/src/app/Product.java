package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
	private String name;
	private Double price;
	private String barcode;
	private Integer remainder;

	public Product(String name, Double price, String barcode, Integer remainder) {
		this.name = name;
		this.price = price;
		this.barcode = barcode;
		this.remainder = remainder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Integer getRemainder() {
		return remainder;
	}

	public void setRemainder(Integer remainder) {
		this.remainder = remainder;
	}

	public static List<Product> importProducts(){
		List<String> productsListString = new ArrayList<String>();
		List<Product> productList = new ArrayList<Product>();
		String[] strs;
		
		File data = new File("products1.txt");
		
		try {
			Scanner scanner = new Scanner(data);

			while (scanner.hasNext()) {
				
				productsListString.add(scanner.nextLine());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("file does not exist");
		}
		
		for(int i = 0 ; i < productsListString.size() ; i++) {
			strs = productsListString.get(i).split(", ");
			
			
			productList.add(new Product(strs[0], Double.parseDouble(strs[1]), strs[2], Integer.parseInt(strs[3])));
		}
		
		return productList;
	}
}
