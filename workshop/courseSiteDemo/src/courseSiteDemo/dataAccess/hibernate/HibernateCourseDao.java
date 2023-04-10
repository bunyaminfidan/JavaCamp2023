package courseSiteDemo.dataAccess.hibernate;

import courseSiteDemo.dataAccess.BaseCourseDatabaseDao;
import courseSiteDemo.entities.Course;

public class HibernateCourseDao implements BaseCourseDatabaseDao {

	@Override
	public void add(Course course) {
		System.out.println("Added to database with Hibernate = " + course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Removed to database with Hibernate = " + course.getCourseName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Updated to database with Hibernate = " + course.getCourseName());
		
	}

}
