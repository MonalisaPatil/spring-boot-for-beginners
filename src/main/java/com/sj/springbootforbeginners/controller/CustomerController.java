package com.sj.springbootforbeginners.controller;

import com.sj.springbootforbeginners.model.Customer;
import com.sj.springbootforbeginners.model.ecommerce.order.Order;
import com.sj.springbootforbeginners.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping(value ="/createCustomer",produces = MediaType.APPLICATION_JSON_VALUE)
    public String createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }
    @GetMapping(value ="/findById")
    public Customer findByID(@RequestParam int customerID){
        return customerService.findByID(customerID);
    }

    @PostMapping(value = "/createCustomerOrderToDatabase" , produces = MediaType.APPLICATION_JSON_VALUE)
    public String createCustomerOrderToDatabase(@RequestBody Order order){
        return customerService.createCustomerOrderToDatabase(order);
    }
}
