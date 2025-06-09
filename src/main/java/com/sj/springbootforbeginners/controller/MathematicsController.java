package com.sj.springbootforbeginners.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Math/api")
public class MathematicsController {

    @GetMapping(value = "/addition")
    public int add(int a , int b ){
        int addition = a + b;
        return addition;
    }
    @GetMapping(value = "/subtraction")
    public int sub(int a , int b ){
        int subtraction = a - b;
        return subtraction;
    }
    @GetMapping(value = "/multiplication")
    public int mul(int a , int b ){
        int multiplication = a * b;
        return multiplication;
    }
    @GetMapping(value = "/division")
    public int div(int a , int b ){
        int division = a / b;
        return division;
    }

}
