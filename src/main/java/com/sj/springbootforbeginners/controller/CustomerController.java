package com.sj.springbootforbeginners.controller;

import com.sj.springbootforbeginners.model.Customer;
import com.sj.springbootforbeginners.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping(value ="/createCustomer",produces = MediaType.APPLICATION_JSON_VALUE)
    public String createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }
    @GetMapping(value ="/findById")
    public Customer findByID(int customerID){
        return customerService.findByID(customerID);
    }

}
