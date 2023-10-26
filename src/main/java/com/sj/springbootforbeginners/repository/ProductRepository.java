package com.sj.springbootforbeginners.repository;

import com.sj.springbootforbeginners.model.ecommerce.product.Product;
import com.sj.springbootforbeginners.model.ecommerce.productSoldVendor.ProductSoldVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

    @Query(value = "SELECT * FROM firstDatabase.product WHERE product_id = ?1", nativeQuery = true)
    Product findProductsByProductId(int productId);
}
