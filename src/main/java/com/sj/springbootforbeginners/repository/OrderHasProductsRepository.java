package com.sj.springbootforbeginners.repository;

import com.sj.springbootforbeginners.model.ShoppingTrend;
import com.sj.springbootforbeginners.model.ecommerce.orderHasProducts.OrderHasProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface OrderHasProductsRepository extends JpaRepository<OrderHasProducts, Long>{

    @Query(value = "SELECT * FROM firstDatabase.order_has_products ohp WHERE order_id = ?1", nativeQuery = true)
    public List<OrderHasProducts> findProuctIdByOrderId (int orderId);




}
