package shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CategoryRep;
import shop.entity.Category;
import shop.service.CategoryService;
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRep cr;
	
	@Override
	public Long addCategory(Category c) {
		Category seveCategory = cr.save(c);
		return seveCategory.getId();
	}

	@Override
	public List<Category> listCategories() {
		return cr.findAll();
	}

	@Override
	public Category getCategory(Long idCat) {
		return cr.findOne(idCat);
	}

	@Override
	public void removeCategrory(Long idcat) {
		cr.delete(idcat);
	}

	@Override
	public void editCategory(Category c) {
		cr.save(c);
		
	}

}
