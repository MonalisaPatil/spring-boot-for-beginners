package com.sj.springbootforbeginners.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface UserRepository extends JpaRepository<com.sj.springbootforbeginners.model.ecommerce.user.User, Long>{
}
