package courseSiteDemo.dataAccess.hibernate;

import courseSiteDemo.dataAccess.BaseTeacherDatabaseDao;
import courseSiteDemo.entities.Teacher;

public class HibernateTeacherDoa implements BaseTeacherDatabaseDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("Added to database with Hibernate = " + teacher.getFirstName());

	}

	@Override
	public void delete(Teacher teacher) {
		System.out.println("Removed to database with Hibernate = " + teacher.getFirstName());

	}

	@Override
	public void update(Teacher teacher) {
		System.out.println("Updated to database with Hibernate = " + teacher.getFirstName());

	}

}
