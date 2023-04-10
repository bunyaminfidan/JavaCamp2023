package courseSiteDemo.dataAccess.jdbc;

import courseSiteDemo.dataAccess.BaseCourseDatabaseDao;
import courseSiteDemo.entities.Course;

public class JdbcCourseDao implements BaseCourseDatabaseDao {

	@Override
	public void add(Course course) {
		System.out.println("Added to database with JDBC = " + course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Removed to database with JDBC = " + course.getCourseName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Updated to database with JDBC = " + course.getCourseName());
		
	}

}
