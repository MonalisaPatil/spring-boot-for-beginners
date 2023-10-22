package com.sj.springbootforbeginners.repository;

import com.sj.springbootforbeginners.model.ecommerce.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface OrdersRepository extends JpaRepository<Order, Long>{
}
