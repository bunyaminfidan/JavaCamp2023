package oopWithNLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers ) {

		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void Add(Product product) throws Exception {
		if (product.getUnitPrice() < 100) {
			throw new Exception("Product price must be over 100€");
		}
		productDao.add(product);
		
		for(Logger logger : loggers) {
			logger.log(product.getName());
		}

	}

}
