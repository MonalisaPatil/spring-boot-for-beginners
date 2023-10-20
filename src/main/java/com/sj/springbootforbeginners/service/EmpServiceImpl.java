package com.sj.springbootforbeginners.service;
import java.util.ArrayList;
import java.util.Optional;

import com.sj.springbootforbeginners.model.Employee;
import com.sj.springbootforbeginners.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



// @Service marks a Java class that performs some service,
// such as executing business logic, performing
// calculations, and calling external APIs.
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public ArrayList<Employee> findAllEmployee() {
		return (ArrayList<Employee>) employeeRepository.findAll();
	}
	
	@Override
	public Employee findAllEmployeeByID(long id) {
		Optional<Employee> opt = employeeRepository.findById(id);
		if (opt.isPresent())
			return opt.get();
		else
			return null;
	}
	
	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	@Override
	public void deleteAllData() {
		employeeRepository.deleteAll();
	}
}
