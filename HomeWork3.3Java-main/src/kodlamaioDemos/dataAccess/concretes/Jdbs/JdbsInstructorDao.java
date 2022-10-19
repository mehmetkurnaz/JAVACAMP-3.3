package kodlamaioDemos.dataAccess.concretes.Jdbs;

import java.util.List;

import kodlamaioDemos.dataAccess.abstracts.IInstructorDao;
import kodlamaioDemos.entities.concretes.Instructor;

public class JdbsInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBS ile eklendi: " + instructor.getName());

	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("JDBS ile güncellendi: " + instructor.getName());

	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("JDBS ile silindi: " + instructor.getName());

	}

	@Override
	public Instructor get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Instructor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
