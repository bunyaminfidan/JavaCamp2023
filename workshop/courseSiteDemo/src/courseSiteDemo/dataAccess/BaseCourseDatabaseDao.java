package courseSiteDemo.dataAccess;

import courseSiteDemo.entities.Course;

public interface BaseCourseDatabaseDao {
	
	void add(Course course);

	void delete(Course course);

	void update(Course course);

}
