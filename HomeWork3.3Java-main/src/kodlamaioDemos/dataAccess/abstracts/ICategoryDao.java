package kodlamaioDemos.dataAccess.abstracts;

import java.util.List;
import kodlamaioDemos.entities.concretes.Category;

public interface ICategoryDao {
	void add(Category category);

	void update(Category category);

	void delete(Category category);

	Category get(int id);

	List<Category> getAll();

}
