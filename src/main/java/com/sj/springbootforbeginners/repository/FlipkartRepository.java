package com.sj.springbootforbeginners.repository;

import com.sj.springbootforbeginners.model.flipkart.FlipkartItem;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlipkartRepository extends JpaRepository<FlipkartItem, Long> {

    // Derived query method
    List<FlipkartItem> findById(String id);

    // Native SQL query
//    @Query(value = "SELECT * FROM users WHERE email = :email", nativeQuery = true)
//    FlipkartItem findByTitle(@Param("email") String email);
//
//    // Custom JPQL query
//    @Query("SELECT u FROM User u WHERE u.email LIKE %:domain")
//    List<FlipkartItem> findUsersByBrand(@Param("brand") String domain);
}
