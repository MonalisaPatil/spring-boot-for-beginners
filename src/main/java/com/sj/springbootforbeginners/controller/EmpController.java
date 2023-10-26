package com.sj.springbootforbeginners.controller;
import java.util.ArrayList;

import com.sj.springbootforbeginners.model.Employee;
import com.sj.springbootforbeginners.service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmpController {
	
	@Autowired
	EmpServiceImpl empServiceImpl;

	@PostMapping("/createEmployee")
	public void add(@RequestBody Employee employee) {
		empServiceImpl.addEmployee(employee);
	}

	@GetMapping("/findall")
	public ArrayList<Employee> getAllEmployee() {
		return empServiceImpl.findAllEmployee();
	}

	@GetMapping("/findbyid/{id}")
	public Employee getEmployeeUsingId(@PathVariable long id) {
		return empServiceImpl.findAllEmployeeByID(id);
	}

	@DeleteMapping("/delete")
	public void delete() {
		empServiceImpl.deleteAllData();
	}
}
// TODO: 10/22/23 Controller ---Product
// TODO: 10/22/23   SHow all the categories
// TODO: 10/22/23  show me products based on the category 
