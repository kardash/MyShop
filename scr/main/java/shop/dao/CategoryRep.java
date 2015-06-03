package shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.entity.Category;

public interface CategoryRep extends JpaRepository<Category, Long> {

}
