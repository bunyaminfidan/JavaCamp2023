package loggerDemo.business;

import loggerDemo.entities.Product;

public interface ProductService {

	public void add(Product product) throws Exception;

	public void update(Product product);

	public void delete(Product product);

}
