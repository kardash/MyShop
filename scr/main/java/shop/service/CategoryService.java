package shop.service;

import java.util.List;

import shop.entity.Category;

public interface CategoryService {
	public Long addCategory(Category c);
	public List<Category> listCategories();
	public Category getCategory(Long idCat);
	public void removeCategrory(Long idcat);
	public void editCategory(Category c);
}
