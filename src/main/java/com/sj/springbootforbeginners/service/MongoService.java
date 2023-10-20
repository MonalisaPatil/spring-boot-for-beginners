package com.sj.springbootforbeginners.service;

import com.sj.springbootforbeginners.model.User;
import com.sj.springbootforbeginners.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class MongoService {

    @Autowired
    private UserRepository userRepository;


    public String createUser(User user) {
        userRepository.save(user);
        return "Successfully added the records";
    }

    public User findItemByName(String name) {
        return userRepository.findItemByName(name);
    }

    public Collection<User> findAll() {
        return userRepository.findAll();
    }

    public String deleteById(String id) {
        userRepository.deleteById(id);
        return "Successfully deleted the record for" + id;
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }

    public List<User> getEmployeesByNameStartsWith(String input) {
        List<User> allUsers = userRepository.findAll();
        char index0 = input.charAt(0);
        List<User> listA = new ArrayList<>();
        for (User e : allUsers) {
            if (e.getName().charAt(0) == index0) {
                listA.add(e);
            }
        }
        return listA;
    }

    public List<String> getPhoneNumberStartWith(String input) {
        List<User> allP = userRepository.findAll();
        List<String> listP = new ArrayList<>();
        for (User p : allP) {
            if (p.getPhoneNumber().startsWith(input)) {
                listP.add(p.getPhoneNumber());
            }
        }
        return listP;
    }

    public int numberOfStudentNameStartsWith(String name) {
        List<User> allN = userRepository.findAll();
        char index0 = name.charAt(0);
        List<String> listN = new ArrayList<>();
        for (User n : allN) {
            if (n.getName().charAt(0) == index0) {
                listN.add(n.getName());
            }
        }
        return listN.size();
    }

    public List<User> allUserWithDivisiblePhoneNumber(int input){
        List<User> allUserP = userRepository.findAll();
        List<User> phoneLog= new ArrayList<>();
        for (User pl: allUserP){
            if (Integer.valueOf(pl.getPhoneNumber())% input ==0 ){
                phoneLog.add(pl);
            }
        }
        return phoneLog;
    }






























}
