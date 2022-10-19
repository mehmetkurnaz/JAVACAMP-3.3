package kodlamaioDemos.business.concretes;

import java.util.List;

import kodlamaioDemos.business.abstracts.IInstructorService;
import kodlamaioDemos.core.abstracts.ILogger;
import kodlamaioDemos.dataAccess.abstracts.IInstructorDao;
import kodlamaioDemos.entities.concretes.Instructor;

public class InstructorManager implements IInstructorService {

	private IInstructorDao instructorDao;
	private ILogger[] loggers;

	public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (ILogger logger : loggers) {
			logger.log(instructor.getName() + instructor.getLastName());
		}

		return;
	}

	@Override
	public List<Instructor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
