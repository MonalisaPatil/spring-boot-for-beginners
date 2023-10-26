package com.sj.springbootforbeginners.service;

import com.sj.springbootforbeginners.model.ecommerce.order.Order;
import com.sj.springbootforbeginners.model.ecommerce.user.User;
import com.sj.springbootforbeginners.repository.OrdersRepository;
import com.sj.springbootforbeginners.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Autowired
    OrdersRepository ordersRepository;

    @Override
    public List<Integer> getAllUserId(){
        List<User> all = userRepository.findAll();
        List<Integer> output = new ArrayList<>();
        for(User temp: all){
            output.add(temp.getUserId());
        }
        return output;
    }

    @Override
    public List<Order> getAllOrderWrtUserID(Long userID){
        User userById = userRepository.findUserIDfromUser(userID);
        List<Order> orderByName = ordersRepository.findOrderByName(userById.getFullName());
        return orderByName;
    }

    @Override
    public List<String> getTrackingNumberOfAllOrderByUserID(Long userID){
        User userById = userRepository.findUserIDfromUser(userID);
        List<Order> orderByName = ordersRepository.findOrderByName(userById.getFullName());
        List<String> trackingNumber = new ArrayList<>();
        for (Order temp: orderByName){
            trackingNumber.add(temp.getTrackingNumber());
        }
        return trackingNumber;
    }

    @Override
    public String updateOrder (long id, Order order) {
        Order updateOrder = ordersRepository.findByOrderId(id);
        if (updateOrder!=null) {
            ordersRepository.delete(updateOrder);
            ordersRepository.save(order);
            return "successfully updated order :" + id;
        } else {
            return "invalid order: " + id;
        }
    }




    }
