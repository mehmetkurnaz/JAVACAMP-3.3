package kodlamaioDemos.business.abstracts;

import java.util.List;

import kodlamaioDemos.entities.concretes.Course;

public interface ICourseService {
	void add(Course course) throws Exception;

	List<Course> getAll();

}
