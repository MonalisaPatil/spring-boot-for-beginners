package com.sj.springbootforbeginners.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {


    private String name;
    @Id
    private Long customerId;
    private String city;
    private String address;
    private String state;
    private String email;
    private int phoneNumber;

}
