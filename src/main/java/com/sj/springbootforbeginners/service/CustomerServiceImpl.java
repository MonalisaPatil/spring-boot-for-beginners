package com.sj.springbootforbeginners.service;

import com.sj.springbootforbeginners.model.Customer;
import com.sj.springbootforbeginners.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public String createCustomer(Customer customer){
        customerRepository.save(customer);
        return "Succefully Updated";
    }

    @Override
    public Customer findByID(int customerID){
        return customerRepository.findById((long)customerID).get();
    }



}
