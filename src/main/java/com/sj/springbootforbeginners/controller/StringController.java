package com.sj.springbootforbeginners.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/String/api")
public class StringController {

    @GetMapping(value = "/Announce")
    public String sayAnything() {
        return "Hello Everyone";
    }
    @GetMapping(value = "/AnnounceWithInfo")
    public String sayAnything(@RequestParam String name) {
        return "Hello "+name;
    }
    @GetMapping(value = "/AnnounceWithInformation")
    public String sayAnything(@RequestParam String name, @RequestParam String city, @RequestParam String phoneNumber) {
        return "Hello "+name  +" Your are located at: "+city + " your phone number is: "+ phoneNumber;
    }

    @GetMapping(value = "/checkPalindrome")
    public boolean checkPalindrome(String word) {
        boolean finalResult = false;
        String reverseWord = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reverseWord = reverseWord.concat(String.valueOf(word.charAt(i)));
        }
        if (word.equals(reverseWord)) {
            finalResult= true;
        }
        return finalResult;
    }
}
