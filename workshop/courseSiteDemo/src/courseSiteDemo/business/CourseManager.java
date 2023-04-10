package courseSiteDemo.business;

import courseSiteDemo.dataAccess.BaseCourseDatabaseDao;
import courseSiteDemo.entities.Course;

public class CourseManager implements ICourseService {

	private BaseCourseDatabaseDao baseCourseDatabaseDao;

	public CourseManager(BaseCourseDatabaseDao baseCourseDatabaseDao) {

		this.baseCourseDatabaseDao = baseCourseDatabaseDao;
	}

	@Override
	public void add(Course course) {

		// same course name is not repeated

		if ("Java Camp" == course.getCourseName()) {
			System.out.println("Sorry! Same course name is not repeated");
		} else if (course.getUnitPrice() <= 0) {
			System.out.println("Sorry! Course price must be over 0");

		} else {

			baseCourseDatabaseDao.add(course);
		}
	}

	@Override
	public void delete(Course course) {
		baseCourseDatabaseDao.delete(course);
	}

	@Override
	public void update(Course course) {
		baseCourseDatabaseDao.update(course);
	}

}
