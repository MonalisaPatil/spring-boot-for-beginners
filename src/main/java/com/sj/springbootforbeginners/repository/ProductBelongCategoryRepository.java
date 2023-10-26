package com.sj.springbootforbeginners.repository;

import com.sj.springbootforbeginners.model.ecommerce.productBelongCategory.ProductBelongsCategory;
import com.sj.springbootforbeginners.model.ecommerce.productSoldVendor.ProductSoldVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface ProductBelongCategoryRepository extends JpaRepository<ProductBelongsCategory, Long>{

    @Query(value = "SELECT product_id  FROM firstDatabase.product_belongs_category WHERE category_id = ?1", nativeQuery = true)
    List<Integer> findAllProductIdByCategory(int categoryId);


    @Query(value = "SELECT category_id  FROM firstDatabase.product_belongs_category pbc WHERE product_id = ?1", nativeQuery = true)
    Integer findCategoryIdByProductId(int productId);
}
