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
}
