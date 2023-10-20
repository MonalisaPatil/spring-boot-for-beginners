package com.sj.springbootforbeginners.service;

import com.sj.springbootforbeginners.model.Employee;
import com.sj.springbootforbeginners.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String save( Employee employee){
        employeeRepository.save(employee);
        return "Successfully added the records";
    }

    public Collection<Employee> findAll(){
        return  employeeRepository.findAll();
    }

    public List<Employee> findItemByEmployeeTitle(String employeeTitle){
        return  employeeRepository.findItemByEmployeeTitle(employeeTitle);
    }

    public  String deleteAll(){
        employeeRepository.deleteAll();
        return "Successfully deleted all";
    }

    public List<String> getEmployeeIDwrtEmployeeTitles(String employeeTitle){
        List<Employee> empAll = employeeRepository.findAll();
        List<String> emp = new ArrayList<>();
        for (Employee eid: empAll){
            if (eid.getEmployeeTitle().equals(employeeTitle)){
                emp.add(eid.getEmployeeID());
            }
        }
        return emp;

    }

    public List<String> getUniqueEmployeeTitle(){
        List<Employee> allEmp = employeeRepository.findAll();
        List<String> uniqueTitles = new ArrayList<>();
        for(Employee emp: allEmp){
            if(!uniqueTitles.contains(emp.getEmployeeTitle())){
                uniqueTitles.add(emp.getEmployeeTitle());
            }
        }
        return uniqueTitles;
    }

    public List<Employee> getEmployeeWrtCityTitleGiven(String employeeCity , String employeeTitle){
        List<Employee> emp = employeeRepository.findAll();
        List<Employee> wrtCityTitle = new ArrayList<>();
        for(Employee wrt: emp){
            if(wrt.getEmployeeTitle().equals(employeeTitle) && wrt.getEmployeeCity().equals(employeeCity)){
                wrtCityTitle.add(wrt);
            }
        }
        return wrtCityTitle;
    }

    public List<String> getCitiesWithGivenVowelCount( int input) {
        List<Employee> emp = employeeRepository.findAll();
        List<Character> vowelChar = new ArrayList<>();
        vowelChar.add('a');
        vowelChar.add('e');
        vowelChar.add('i');
        vowelChar.add('o');
        vowelChar.add('u');
        List<String> finalResponse = new ArrayList<>();

        for (Employee employee : emp) {
            int count = 0;
            for (char c : employee.getEmployeeCity().toLowerCase().toCharArray()) {
                if (vowelChar.contains(c)) {
                    count++;
                }
            }
            if (count == input) {
                finalResponse.add(employee.getEmployeeCity());
            }
        }
        return finalResponse;
    }
//        for (Employee vc: emp){
//            if(vc.getEmployeeCity().toCharArray().equals()){
//
//            }
//        }
 //   }



}
