package courseSiteDemo.business;

import courseSiteDemo.dataAccess.BaseCategoryDatabaseDao;
import courseSiteDemo.entities.Category;

public class CategoryManager implements ICategoryService {

	private BaseCategoryDatabaseDao baseCategoryDatabaseDao;

	public CategoryManager(BaseCategoryDatabaseDao baseCategoryDatabaseDao) {
		super();
		this.baseCategoryDatabaseDao = baseCategoryDatabaseDao;
	}

	@Override
	public void add(Category category) {

		// same category name is not repeated

		if ("Java"  == category.getCategoryName()) {
			System.out.println("Sorry! Same category name is not repeated");
		} else {
			
			baseCategoryDatabaseDao.add(category);

		}

	}

	@Override
	public void delete(Category category) {
		baseCategoryDatabaseDao.delete(category);
	}

	@Override
	public void update(Category category) {
		baseCategoryDatabaseDao.update(category);
	}

}
