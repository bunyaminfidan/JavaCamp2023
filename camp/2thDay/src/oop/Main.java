package oop;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();

		// set value
		product1.setName("Delonghi Coffee Machine");
		product1.setUnitPrice(3343);
		product1.setUnitsInStock(45);
		product1.setDiscount(33);
		product1.setImageUrl("imageUrl.jpg");

		product2.setName("Karaca Coffee Machine");
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(35);
		product2.setDiscount(10);
		product2.setImageUrl("imageUrl.jpg");

		product3.setName("Nespresso Coffee Machine");
		product3.setUnitPrice(1222);
		product3.setUnitsInStock(2);
		product3.setDiscount(55);
		product3.setImageUrl("imageUrl.jpg");

		Product[] products = { product1, product2, product3 };

		// get value

		for (Product product : products) {

			System.out.println(product.getName());
			System.out.println(product.getUnitPrice());
			System.out.println(product.getDiscount());
			System.out.println(product.getImageUrl());
			System.out.println(product.getUnitsInStock());

		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setPhoneNumber("65656");
		individualCustomer.setFirstName("Bunyamin");
		individualCustomer.setLastName("FIDAN");

		CorporateCustomer corporateCustomer = new CorporateCustomer();

		corporateCustomer.setId(1212);
		corporateCustomer.setCustomerNumber("33");
		corporateCustomer.setPhoneNumber("343434");
		corporateCustomer.setCompanyName("FIDAN AS");
		corporateCustomer.setTaxNumber("942323");

		Customer[] customer = { individualCustomer, corporateCustomer };

	}

}
