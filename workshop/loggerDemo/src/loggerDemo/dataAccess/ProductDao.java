package loggerDemo.dataAccess;

import loggerDemo.entities.Product;

public interface ProductDao {

	public void add(Product product);

	public void update(Product product);

	public void delete(Product product);
}
