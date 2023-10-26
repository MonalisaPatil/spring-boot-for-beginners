package com.sj.springbootforbeginners.repository;

import com.sj.springbootforbeginners.model.ecommerce.category.Category;
import com.sj.springbootforbeginners.model.ecommerce.user.User;
import com.sj.springbootforbeginners.model.ecommerce.userHasCreditCard.UserHasCreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface UserHasCreditCardRepository extends JpaRepository<UserHasCreditCard, Long>{

    @Query(value = "SELECT credit_card_number FROM firstDatabase.user_has_credit_card uhcc WHERE user_id = ?1", nativeQuery = true)
    public Long findCreditCardByUSerID(int userId);
}
