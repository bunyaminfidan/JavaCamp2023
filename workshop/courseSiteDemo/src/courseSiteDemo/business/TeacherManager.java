package courseSiteDemo.business;

import courseSiteDemo.dataAccess.BaseTeacherDatabaseDao;
import courseSiteDemo.entities.Teacher;

public class TeacherManager implements ITeacherService {

	private BaseTeacherDatabaseDao baseTeacherDatabaseDao;

	public TeacherManager(BaseTeacherDatabaseDao baseTeacherDatabaseDao) {
		super();
		this.baseTeacherDatabaseDao = baseTeacherDatabaseDao;
	}

	@Override
	public void add(Teacher teacher) {
		baseTeacherDatabaseDao.add(teacher);
	}

	@Override
	public void delete(Teacher teacher) {
		baseTeacherDatabaseDao.delete(teacher);
	}

	@Override
	public void update(Teacher teacher) {
		baseTeacherDatabaseDao.update(teacher);
	}

}
