package com.sj.springbootforbeginners.service;

import com.sj.springbootforbeginners.model.Customer;
import com.sj.springbootforbeginners.model.ecommerce.order.Order;
import org.springframework.http.ResponseEntity;

public interface CustomerService {


    public String createCustomer(Customer customer);

    public Customer findByID(int customerId );

    public String createCustomerOrderToDatabase(Order order);


}
