package kodlamaioDemos;

import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.List;

import kodlamaioDemos.business.abstracts.ICategoryService;
import kodlamaioDemos.business.abstracts.ICourseService;
import kodlamaioDemos.business.abstracts.IInstructorService;
import kodlamaioDemos.business.concretes.CategoryManager;
import kodlamaioDemos.business.concretes.CourseManager;
import kodlamaioDemos.business.concretes.InstructorManager;
import kodlamaioDemos.core.abstracts.ILogger;
import kodlamaioDemos.core.concretes.DatabaseLogger;
import kodlamaioDemos.core.concretes.FileLogger;
import kodlamaioDemos.core.concretes.MailLogger;
import kodlamaioDemos.dataAccess.concretes.Hibernate.HibernateCategoryDao;
import kodlamaioDemos.dataAccess.concretes.Hibernate.HibernateCourseDao;
import kodlamaioDemos.dataAccess.concretes.Hibernate.HibernateInstructorDao;
import kodlamaioDemos.dataAccess.concretes.Jdbs.JdbsCategoryDao;
import kodlamaioDemos.dataAccess.concretes.Jdbs.JdbsCourseDao;
import kodlamaioDemos.dataAccess.concretes.Jdbs.JdbsInstructorDao;
import kodlamaioDemos.entities.concretes.Category;
import kodlamaioDemos.entities.concretes.Course;
import kodlamaioDemos.entities.concretes.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		List<Category> categoryDb = new ArrayList<>();
		List<Course> courseDb = new ArrayList<>();
		ILogger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		ICourseService courseService = new CourseManager(new HibernateCourseDao(), courseDb, loggers);
		ICategoryService categoryService = new CategoryManager(new JdbsCategoryDao(), categoryDb, loggers);
		IInstructorService instructorService = new InstructorManager(new JdbsInstructorDao(), loggers);

		Course course1 = new Course(1, "Programlamaya Giriş", 1, "Programlama", 1, "Engin Demiroğ", 100, 10000);
		Course course2 = new Course(2, "2022 Java", 1, "Programlama", 1, "Engin Demiroğ", 1005, 10000);
		Course course3 = new Course(3, "2022 Java", 1, "Programlama", 1, "Engin Demiroğ", -200, 10000);
		Course course4 = new Course(4, "Java+React", 1, "Programlama", 1, "Engin Demiroğ", 305, 10000);
		Course course5 = new Course(5, ".Net", 1, "Programlama", 1, "Engin Demiroğ", 1907, 10000);
		Course course6 = new Course(6, "JavaScript", 1, "Programlama", 1, "Engin Demiroğ", 152, 10000);
		Course course7 = new Course(7, "İngilizce", 1, "Yabancı Dil", 1, "Engin Demiroğ", 100, 55);

		Category category1 = new Category(1, "Programlama", 6);
		Category category2 = new Category(2, "Yabancı Dil", 1);
		Category category3 = new Category(3, "Programlama", 6);

		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", 6);

		courseService.add(course1);
		courseService.add(course2);
		courseService.add(course3);
		courseService.add(course4);
		courseService.add(course5);
		courseService.add(course6);
		courseService.add(course7);

		categoryService.add(category1);
		categoryService.add(category2);
		categoryService.add(category3);

		instructorService.add(instructor1);

	}

}
