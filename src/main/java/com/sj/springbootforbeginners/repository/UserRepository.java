package com.sj.springbootforbeginners.repository;

import com.sj.springbootforbeginners.model.ecommerce.order.Order;
import com.sj.springbootforbeginners.model.ecommerce.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface UserRepository extends JpaRepository<com.sj.springbootforbeginners.model.ecommerce.user.User, Long>{

    @Query(value = "SELECT * FROM firstDatabase.`user` u WHERE user_id  = ?1", nativeQuery = true)
    public User findUserIDfromUser( Long UserID);

    @Query(value = "SELECT * FROM firstDatabase.`user` u WHERE full_name = ?1", nativeQuery = true)
    public User findUserByUserName( String UserName);

}
