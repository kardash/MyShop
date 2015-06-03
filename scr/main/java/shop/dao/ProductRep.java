package shop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import shop.entity.Product;

public interface ProductRep extends JpaRepository<Product, Long> {

	@Query("SELECT p FROM Product p "
			+ "  where p.designation like :s or p.description like :s")
    List<Product> findByKeyWord(@Param("s") String s);

	
	@Query("SELECT p FROM Product p WHERE p.category.id=:id ")
	List<Product> findByCategory(@Param("id") Long idCat);

    @Query("select p from Product p where p.selected=true")
	List<Product> findBySelect();

}
