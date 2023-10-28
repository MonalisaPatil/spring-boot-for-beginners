package com.sj.springbootforbeginners.repository;

import com.sj.springbootforbeginners.model.ecommerce.orderHasProducts.OrderHasProducts;
import com.sj.springbootforbeginners.model.ecommerce.product.Product;
import com.sj.springbootforbeginners.model.ecommerce.productHasOptions.ProductHasOptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface ProductHasOptionsRepository extends JpaRepository<ProductHasOptions, Long>{

    @Query(value = "SELECT price FROM firstDatabase.product_has_options pho WHERE product_id =?1 AND option_id =?2", nativeQuery = true)
    public int findPriceByProductIdAndOptionId (int productId, int optionId);

    @Query(value = "SELECT * FROM firstDatabase.product_has_options pho WHERE product_id = ?1", nativeQuery = true)
    List<ProductHasOptions> findAllOptionsByProductId (int productId);

    @Query(value = "SELECT * FROM firstDatabase.product_has_options pho WHERE price <= ?1",nativeQuery = true)
    List<ProductHasOptions> findAllOptionsByGivenPriceLessThan( int price);
}
