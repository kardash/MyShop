package shop.service;

import java.util.List;

import shop.entity.Product;

public interface ProductService {
	public Long addProduct(Product p, Long idCat);
	public List<Product> listproducts();
	public Product getProduct(Long idP);
	public void removeProduct(Long idP);
	public void editProduct(Product p);
	public List<Product> productsByKeyWord(String s);
	public List<Product> productsByCategories(Long idCat);
	public List<Product> productsSelect();
}
