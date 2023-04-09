package loggerDemo.business;

import java.lang.System.Logger;

import loggerDemo.core.BaseLogger;
import loggerDemo.dataAccess.ProductDao;
import loggerDemo.entities.Product;

public class ProductManager implements ProductService {

	ProductDao productDao;
	BaseLogger[] baseLoggers;

	public ProductManager(ProductDao productDao, BaseLogger[] baseLoggers) {

		this.productDao = productDao;
		this.baseLoggers = baseLoggers;
	}

	@Override
	public void add(Product product) throws Exception {

		if (product.getPrice() < 1389) {
			throw new Exception("Price must be over 1389€");
		}

		productDao.add(product);

		for (BaseLogger baseLogger : baseLoggers) {
			baseLogger.addLog(product.getProductName());
		}

	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub

	}

}
