package shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.CategoryRep;
import shop.dao.ProductRep;
import shop.entity.Category;
import shop.entity.Product;
import shop.service.ProductService;


@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRep pr;
	private CategoryRep cr;
	@Override
	public Long addProduct(Product p, Long idCat) {
		Category category = cr.findOne(idCat);
		p.setCategory(category);
		return p.getId();
	}

	@Override
	public List<Product> listproducts() {
		
		return pr.findAll();
	}

	@Override
	public Product getProduct(Long idP) {
		return pr.findOne(idP);
	}

	@Override
	public void removeProduct(Long idP) {
	   pr.delete(idP);	
	}

	@Override
	public void editProduct(Product p) {
     pr.save(p);		
	}

	@Override
	public List<Product> productsByKeyWord(String s) {
		return pr.findByKeyWord(s);
	}

	@Override
	public List<Product> productsByCategories(Long idCat) {
		return pr.findByCategory(idCat);
	}

	@Override
	public List<Product> productsSelect() {
		return pr.findBySelect();
	}}
