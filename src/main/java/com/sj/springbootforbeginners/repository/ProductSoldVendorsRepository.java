package com.sj.springbootforbeginners.repository;

import com.sj.springbootforbeginners.model.ecommerce.cartHasProdcuts.CartHasProducts;
import com.sj.springbootforbeginners.model.ecommerce.productSoldVendor.ProductSoldVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface ProductSoldVendorsRepository extends JpaRepository<ProductSoldVendor, Long>{
    @Query(value=" SELECT  vendor_id FROM firstDatabase.product_sold_vendor psv WHERE product_id =?1", nativeQuery = true)
    int findVendorIdByProductId (int product_id);
}
