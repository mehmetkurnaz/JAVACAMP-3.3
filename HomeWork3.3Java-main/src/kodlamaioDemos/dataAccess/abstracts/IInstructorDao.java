package kodlamaioDemos.dataAccess.abstracts;

import java.util.List;
import kodlamaioDemos.entities.concretes.Instructor;

public interface IInstructorDao {
	void add(Instructor ınstructor);
	void update(Instructor ınstructor);
	void delete(Instructor ınstructor);
	Instructor get(int id);
	List<Instructor> getAll();

}
