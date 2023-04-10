package courseSiteDemo.business;

import courseSiteDemo.entities.Category;
import courseSiteDemo.entities.Course;

public interface ICourseService {
	
	void add(Course  course);

	void delete(Course  course);

	void update(Course  course);

}
