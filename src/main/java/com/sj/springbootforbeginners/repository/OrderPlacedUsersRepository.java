package com.sj.springbootforbeginners.repository;

import com.sj.springbootforbeginners.model.ecommerce.cartHasProdcuts.CartHasProducts;
import com.sj.springbootforbeginners.model.ecommerce.orderPlacedUser.OrderPlacedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface OrderPlacedUsersRepository extends JpaRepository<OrderPlacedUser, Long>{
}
