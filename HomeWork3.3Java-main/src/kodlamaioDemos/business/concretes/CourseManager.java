package kodlamaioDemos.business.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemos.business.abstracts.ICourseService;
import kodlamaioDemos.core.abstracts.ILogger;
import kodlamaioDemos.dataAccess.abstracts.ICourseDao;
import kodlamaioDemos.entities.concretes.Category;
import kodlamaioDemos.entities.concretes.Course;

public class CourseManager implements ICourseService {

	private ICourseDao courseDao;
	private ILogger[] loggers;

	private List<Course> courses = new ArrayList<Course>();

	public CourseManager(ICourseDao courseDao, List<Course> courses, ILogger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}

	@Override
	public void add(Course course) throws Exception {
		if (course.getPrice() < 0) {
			System.out.println("Kursun fiyatı 0'dan az olamaz" + course.getPrice());
			for (Course _course : courses) {
				if (_course.getName().equals(course.getName())) {
					System.out.println(" Kursun adı aynı olamaz. : " + course.getName());

				}
			}

		}

		courseDao.add(course);
		courses.add(course);
		for (ILogger logger : loggers) {
			logger.log(course.getName());
		}

	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
