package com.sj.springbootforbeginners.repository;

import com.sj.springbootforbeginners.model.ecommerce.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface OrdersRepository extends JpaRepository<Order, Long>{

    @Query(value = "SELECT * FROM firstDatabase.final_orders fo WHERE ship_name = ?1",nativeQuery = true)
    public List<Order> findOrderByName(String shipName);

    @Query(value = "SELECT * FROM firstDatabase.final_orders fo WHERE order_Number = ?1",nativeQuery = true)
    public Order findByOrderId(long orderId);

    @Query(value = "SELECT * FROM firstDatabase.final_orders WHERE order_number =?1",nativeQuery = true)
    public Order findByOrderIdString(String orderId);


}
