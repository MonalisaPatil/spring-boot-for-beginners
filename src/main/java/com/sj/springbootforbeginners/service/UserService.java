package com.sj.springbootforbeginners.service;

import com.sj.springbootforbeginners.model.ecommerce.order.Order;
import com.sj.springbootforbeginners.model.ecommerce.user.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserService {

    public List<Integer> getAllUserId();

    public List<Order> getAllOrderWrtUserID(Long userID);

    public List<String> getTrackingNumberOfAllOrderByUserID(Long userID);

    public String updateOrder (long id, Order order);






    }
