package com.sj.springbootforbeginners.repository;

import com.sj.springbootforbeginners.model.ecommerce.orderHasProducts.OrderHasProducts;
import com.sj.springbootforbeginners.model.ecommerce.orderPlacedCredicCard.OrderPlacedCreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface OrderPlacedCreditCardRepository extends JpaRepository<OrderPlacedCreditCard, Long>{
}
