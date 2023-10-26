package com.sj.springbootforbeginners.service;

import com.sj.springbootforbeginners.model.Customer;
import com.sj.springbootforbeginners.model.ecommerce.order.Order;
import com.sj.springbootforbeginners.repository.CustomerRepository;
import com.sj.springbootforbeginners.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrdersRepository ordersRepository;

    @Override
    public String createCustomer(Customer customer){
        customerRepository.save(customer);
        return "Succefully Updated";
    }

    @Override
    public Customer findByID(int customerID){
        return customerRepository.findById((long)customerID).get();
    }

    @Override
    public String createCustomerOrderToDatabase(Order order){
    ordersRepository.save(order);
    return "Succefully Updated";
    }



}
