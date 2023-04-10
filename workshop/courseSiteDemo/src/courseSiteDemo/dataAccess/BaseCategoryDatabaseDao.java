package courseSiteDemo.dataAccess;

import courseSiteDemo.entities.Category;

public interface BaseCategoryDatabaseDao {

	void add(Category category);

	void delete(Category category);

	void update(Category category);

}
