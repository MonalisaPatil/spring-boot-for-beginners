package com.sj.springbootforbeginners.service;

import com.sj.springbootforbeginners.model.Customer;

public interface CustomerService {


    public String createCustomer(Customer customer);

    public Customer findByID(int customerId );



}
