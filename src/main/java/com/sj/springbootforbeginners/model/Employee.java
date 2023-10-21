package com.sj.springbootforbeginners.model;
  
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
  

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    
    // @ID This annotation specifies 
    // the primary key of the entity.
    @Id

    // @GeneratedValue This annotation
    // is used to specify the primary
    // key generation strategy to use
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private long id;
    private String name;
    private String city;
  

  
}