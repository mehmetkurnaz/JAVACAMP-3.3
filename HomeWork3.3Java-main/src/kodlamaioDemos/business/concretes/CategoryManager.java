package kodlamaioDemos.business.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemos.business.abstracts.ICategoryService;
import kodlamaioDemos.core.abstracts.ILogger;
import kodlamaioDemos.dataAccess.abstracts.ICategoryDao;
import kodlamaioDemos.dataAccess.concretes.Hibernate.HibernateCategoryDao;
import kodlamaioDemos.entities.concretes.Category;

public class CategoryManager implements ICategoryService {

	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	private List<Category> categories = new ArrayList<Category>();

	public CategoryManager(ICategoryDao categoryDao, List<Category> categories, ILogger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}

	@Override
	public void add(Category category) throws Exception {
		for (Category _category : categories) {
			if (_category.getName().equals(category.getName())) {
				System.out.println(new Exception("Kategori adı tekrar edemez. : " + category.getName()));
			}
		}
		categoryDao.add(category);
		categories.add(category);
		for (ILogger logger : loggers) {
			logger.log(category.getName());
		}

	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
