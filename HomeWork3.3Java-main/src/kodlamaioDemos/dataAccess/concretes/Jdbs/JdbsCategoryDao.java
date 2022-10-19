package kodlamaioDemos.dataAccess.concretes.Jdbs;

import java.util.List;

import kodlamaioDemos.dataAccess.abstracts.ICategoryDao;
import kodlamaioDemos.entities.concretes.Category;

public class JdbsCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBS ile eklendi: " + category.getName());

	}

	@Override
	public void update(Category category) {
		System.out.println("JDBS ile güncellendi: " + category.getName());

	}

	@Override
	public void delete(Category category) {
		System.out.println("JDBS ile silindii: " + category.getName());

	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
