package com.sj.springbootforbeginners.controller;

import com.sj.springbootforbeginners.model.Employee;
import com.sj.springbootforbeginners.model.User;
import com.sj.springbootforbeginners.repository.EmployeeRepository;
import com.sj.springbootforbeginners.repository.UserRepository;
import com.sj.springbootforbeginners.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("info/employee")
public class EmployeeController {

        @Autowired
        private EmployeeService employeeService;

        @PostMapping(value = "/createEmployeeInfo", produces = MediaType.APPLICATION_JSON_VALUE)
        public String employeeInfo(@RequestBody Employee employee) {
                employeeService.save(employee);
                return "Successfully added the records";
        }

        @GetMapping(value = "/getAllEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
        public Collection<Employee> getAllEmployee() {
                return employeeService.findAll();
        }

        @GetMapping(value = "/getByEmployeeTitle", produces = MediaType.APPLICATION_JSON_VALUE)
        public List<Employee> employeeTitle(@RequestParam String employeeTitle) {
                return employeeService.findItemByEmployeeTitle(employeeTitle);
        }

        @DeleteMapping(value = "/deleteAllEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
        public String deleteAllEmployee() {
                employeeService.deleteAll();
                return "Successfully deleted all";
        }


        @GetMapping(value= "/getEmployeeIDwrtEmployeeTitle", produces = MediaType.APPLICATION_JSON_VALUE)
        public List<String> getEmployeeIDwrtEmployeeTitle(@RequestParam String employeeTitle){
                return employeeService.getEmployeeIDwrtEmployeeTitles(employeeTitle);
        }

        @GetMapping(value="/getUniqueEmployeeTitle", produces = MediaType.APPLICATION_JSON_VALUE)
        public List<String> getUniqueEmployeeTitle(){
                return employeeService.getUniqueEmployeeTitle();
        }
        @GetMapping(value="/getEmployeeWrtCityTitleGiven", produces = MediaType.APPLICATION_JSON_VALUE)
        public List<Employee> getEmployeeWrtCityTitleGiven(@RequestParam String employeeTitle, @RequestParam String employeeCity){
                return employeeService.getEmployeeWrtCityTitleGiven(employeeCity,employeeTitle);
        }
        // TODO: 10/18/23  Write a program to exrtract employees whose cities have equal or more than three vowel character.
        @GetMapping(value="/getCitieswithGivenVowelCount", produces = MediaType.APPLICATION_JSON_VALUE)
        public List<String> getCitiesWithGivenVowelCount(@RequestParam int input){
                return employeeService.getCitiesWithGivenVowelCount(input);
        }

//        @GetMapping(value="/getCountry", produces = MediaType.APPLICATION_JSON_VALUE)
//        public  List<String> getCountry(){
//                return employeeService.getCountry
//        }


}

