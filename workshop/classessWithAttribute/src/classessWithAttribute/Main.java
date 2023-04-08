package classessWithAttribute;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.setId(1);
		product.setName("Coffee Machine");
		product.setPrice(1242);
		product.setStockAmount(54);
		product.setDescription("make awesome a coffee yourself");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getProductCode());

	}

}
