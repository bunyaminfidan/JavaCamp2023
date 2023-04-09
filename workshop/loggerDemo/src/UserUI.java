
import loggerDemo.business.ProductService;
import loggerDemo.core.BaseLogger;
import loggerDemo.entities.Product;

public class UserUI {

	private ProductService productService;

	public UserUI(ProductService productService) {
		this.productService = productService;
	}

	public void add(Product product) throws Exception {
		productService.add(product);

	}

}
