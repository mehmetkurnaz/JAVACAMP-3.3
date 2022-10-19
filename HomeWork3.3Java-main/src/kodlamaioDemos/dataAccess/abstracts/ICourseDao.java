package kodlamaioDemos.dataAccess.abstracts;

import java.util.List;

import kodlamaioDemos.entities.concretes.Course;

public interface ICourseDao {
	void add(Course course);

	void update(Course course);

	void delete(Course course);

	Course get(int id);

	List<Course> getAll();
}
