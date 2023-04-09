package loggerDemo.dataAccess;

import loggerDemo.entities.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Added to Database with Hibernate "+ product.getProductName());
		
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
