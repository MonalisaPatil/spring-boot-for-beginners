package com.sj.springbootforbeginners.controller;


import java.util.HashSet;
import java.util.Set;

public class HashSetLearning {
    public static void main(String[] args) {
//        HashSet<String> cars = new HashSet<String>();
        Set<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");

        cars.clear();
        System.out.println(cars);
    }
}


