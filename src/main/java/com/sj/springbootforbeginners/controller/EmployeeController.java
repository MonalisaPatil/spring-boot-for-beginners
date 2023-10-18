package com.sj.springbootforbeginners.controller;

import com.sj.springbootforbeginners.model.Employee;
import com.sj.springbootforbeginners.model.User;
import com.sj.springbootforbeginners.repository.EmployeeRepository;
import com.sj.springbootforbeginners.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("info/employee")
public class EmployeeController {

        @Autowired
        private EmployeeRepository employeeRepository;

        @PostMapping(value = "/createEmployeeInfo", produces = MediaType.APPLICATION_JSON_VALUE)
        public String employeeInfo(@RequestBody Employee employee) {
                employeeRepository.save(employee);
                return "Successfully added the records";
        }

        @GetMapping(value = "/getAllEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
        public Collection<Employee> getAllEmployee() {
                return employeeRepository.findAll();
        }

        @GetMapping(value = "/getByEmployeeTitle", produces = MediaType.APPLICATION_JSON_VALUE)
        public List<Employee> employeeTitle(@RequestParam String employeeTitle) {
                return employeeRepository.findItemByEmployeeTitle(employeeTitle);
        }

        @DeleteMapping(value = "/deleteAllEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
        public String deleteAllEmployee() {
                employeeRepository.deleteAll();
                return "Successfully deleted all";
        }

}

