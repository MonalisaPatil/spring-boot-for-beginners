package com.sj.springbootforbeginners.repository;

import com.sj.springbootforbeginners.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface EmployeeRepository extends MongoRepository <Employee, String>{



    @Query("{employeeTitle:'?0'}")
    List<Employee> findItemByEmployeeTitle(String employeeTitle);

    @Query("{employeeState:'?0'}")
    Employee findItemByState(String employeeState);


}

