package kodlamaioDemos.business.abstracts;

import java.util.List;
import kodlamaioDemos.entities.concretes.Category;

public interface ICategoryService {
	void add(Category category) throws Exception;

	List<Category> getAll();

}
