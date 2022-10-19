package kodlamaioDemos.dataAccess.concretes.Jdbs;

import java.util.List;

import kodlamaioDemos.dataAccess.abstracts.ICourseDao;
import kodlamaioDemos.entities.concretes.Course;

public class JdbsCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("JDBS ile eklendi: " + course.getName());

	}

	@Override
	public void update(Course course) {
		System.out.println("JDBS ile güncellendi: " + course.getName());

	}

	@Override
	public void delete(Course course) {
		System.out.println("JDBS ile silindi: " + course.getName());

	}

	@Override
	public Course get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
