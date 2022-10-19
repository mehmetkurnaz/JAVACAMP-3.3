package kodlamaioDemos.dataAccess.concretes.Hibernate;

import java.util.List;

import kodlamaioDemos.dataAccess.abstracts.ICourseDao;
import kodlamaioDemos.entities.concretes.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile eklendi: " + course.getName());
	}

	@Override
	public void update(Course course) {
		System.out.println("Hibernate ile güncellendi: " + course.getName());

	}

	@Override
	public void delete(Course course) {
		System.out.println("Hibernate ile silindi: " + course.getName());

	}

	@Override
	public Course get(int id) {

		return null;
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
