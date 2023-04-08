package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao  implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("All data added datebase with Hibernate");
		
	}
	
	

}
