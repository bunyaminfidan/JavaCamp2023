import loggerDemo.business.ProductManager;
import loggerDemo.core.BaseLogger;
import loggerDemo.core.EmailLogger;
import loggerDemo.core.FileLogger;
import loggerDemo.core.SmsLogger;
import loggerDemo.dataAccess.HibernateProductDao;
import loggerDemo.dataAccess.JdbcProductDao;
import loggerDemo.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {

		UserUI userUI = new UserUI(
				new ProductManager(new HibernateProductDao(), new BaseLogger[] { new FileLogger(), new FileLogger()}));

		Product product = new Product();

		product.setId(1);
		product.setProductName("Telefon");
		product.setDescription("Iphone 14 Pro Max 128 Gb Purple Colour");
		product.setPrice(1390);
		product.setAmountStock(15);

		userUI.add(product);

	}

}
