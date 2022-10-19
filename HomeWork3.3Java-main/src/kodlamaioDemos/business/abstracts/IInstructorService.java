package kodlamaioDemos.business.abstracts;

import java.util.List;
import kodlamaioDemos.entities.concretes.Instructor;

public interface IInstructorService {
	void add(Instructor instructor);

	List<Instructor> getAll();

}
