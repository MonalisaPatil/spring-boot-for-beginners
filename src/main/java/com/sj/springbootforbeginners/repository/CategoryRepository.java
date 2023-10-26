package com.sj.springbootforbeginners.repository;

import com.sj.springbootforbeginners.model.ecommerce.cartHasProdcuts.CartHasProducts;
import com.sj.springbootforbeginners.model.ecommerce.category.Category;
import com.sj.springbootforbeginners.model.ecommerce.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    @Query(value= "SELECT category_name FROM firstDatabase.category c WHERE category_id = ?1",nativeQuery = true)
    String findCategoryNameByCategoryId( int categoryId);


}
