package courseSiteDemo.dataAccess.jdbc;

import courseSiteDemo.dataAccess.BaseTeacherDatabaseDao;
import courseSiteDemo.entities.Teacher;

public class JdbcTeacherDao implements BaseTeacherDatabaseDao{

	@Override
	public void add(Teacher teacher) {
		System.out.println("Added to database with JDBC = " + teacher.getFirstName());
		
	}

	@Override
	public void delete(Teacher teacher) {
		System.out.println("Removed to database with JDBC = " + teacher.getFirstName());
		
	}

	@Override
	public void update(Teacher teacher) {
		System.out.println("Updated to database with JDBC = " + teacher.getFirstName());
		
	}

}
