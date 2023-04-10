package courseSiteDemo;

import courseSiteDemo.business.CategoryManager;
import courseSiteDemo.business.CourseManager;
import courseSiteDemo.business.ICategoryService;
import courseSiteDemo.business.ICourseService;
import courseSiteDemo.business.ITeacherService;
import courseSiteDemo.business.TeacherManager;
import courseSiteDemo.dataAccess.hibernate.HibernateCategoryDao;
import courseSiteDemo.dataAccess.hibernate.HibernateCourseDao;
import courseSiteDemo.dataAccess.hibernate.HibernateTeacherDoa;
import courseSiteDemo.dataAccess.jdbc.JdbCategoryDao;
import courseSiteDemo.dataAccess.jdbc.JdbcCourseDao;
import courseSiteDemo.dataAccess.jdbc.JdbcTeacherDao;
import courseSiteDemo.entities.Category;
import courseSiteDemo.entities.Course;
import courseSiteDemo.entities.Teacher;

public class Main {

	public static void main(String[] args) {
		// Demo UI Screen is Here

		ICategoryService categoryService = new CategoryManager(new JdbCategoryDao());
		ITeacherService teacherService = new TeacherManager(new JdbcTeacherDao());
		ICourseService courseService = new CourseManager(new JdbcCourseDao());

		Category category = new Category();
		Teacher teacher = new Teacher();
		Course course = new Course();

		category.setId(1);
		category.setCategoryName("Java 1");

		teacher.setId(1);
		teacher.setFirstName("Bunyamin");
		teacher.setLastName("FIDAN");

		course.setId(1);
		course.setCourseName("Java Camp 1");
		course.setImageUrl("javacamp.jpg");
		course.setRatio(5);
		course.setUnitPrice(100);

		teacherService.add(teacher);
		courseService.add(course);
		categoryService.add(category);

	}

}
