package courseSiteDemo.dataAccess;

import courseSiteDemo.entities.Teacher;

public interface BaseTeacherDatabaseDao {

	void add(Teacher teacher);

	void delete(Teacher teacher);

	void update(Teacher teacher);
}
