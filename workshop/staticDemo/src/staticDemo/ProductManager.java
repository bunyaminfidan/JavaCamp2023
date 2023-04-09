package staticDemo;

public class ProductManager {
	
	
	
	public void add(Product product) {
		
		if (ProductValidator.isValid(product)) {
			System.out.println("Added to database = " + product.name);
		} else {
			
			System.out.println("Product name must be  or price must  over be 0 ");

		}
		
		
		
	}

}
