package courseSiteDemo.business;

import courseSiteDemo.entities.Course;
import courseSiteDemo.entities.Teacher;

public interface ITeacherService {
	
	void add(Teacher teacher);

	void delete(Teacher teacher);

	void update(Teacher teacher);

}
