package com.sj.springbootforbeginners.controller;

import com.sj.springbootforbeginners.model.ecommerce.order.Order;
import com.sj.springbootforbeginners.model.ecommerce.user.User;
import com.sj.springbootforbeginners.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @GetMapping(value = "/getAllUserId", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Integer> getAllUserId(){
        return userServiceImpl.getAllUserId();
    }

    @GetMapping(value = "/getAllOrderWrtUserID", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Order> getAllOrderWrtUserID(Long userID){
        return userServiceImpl.getAllOrderWrtUserID(userID);
    }

    @GetMapping(value = "/getTrackingNumberOfAllOrderByUserID", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getTrackingNumberOfAllOrderByUserID(Long userID){
        return userServiceImpl.getTrackingNumberOfAllOrderByUserID(userID);
    }

    @PutMapping({"id"})
    public String updateOrder (@RequestParam long id, @RequestBody Order order){
        return userServiceImpl.updateOrder(id,order);
    }



}



    // TODO: 10/22/23 write an endpoint to extract all the usersIds

    // TODO: 10/22/23 write an endpoint to extract all the orders that are associated with a given userId

    // TODO: 10/22/23 write an endpoint to extract all the tracking ids that are associated with orders for a given userId

    // TODO: 10/24/23 Write an endpoint to insert an custom order to the database

    // TODO: 10/24/23 write an endpoint update an order based on orderId















