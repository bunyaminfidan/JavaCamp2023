package courseSiteDemo.dataAccess.hibernate;

import courseSiteDemo.dataAccess.BaseCategoryDatabaseDao;
import courseSiteDemo.entities.Category;

public class HibernateCategoryDao implements BaseCategoryDatabaseDao {

	@Override
	public void add(Category category) {
		System.out.println("Added to database with Hibernate = " + category.getCategoryName());
			
	}

	@Override
	public void delete(Category category) {
		System.out.println("Removed to database with Hibernate = " + category.getCategoryName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Updated to database with Hibernate = " + category.getCategoryName());
		
	}

}
