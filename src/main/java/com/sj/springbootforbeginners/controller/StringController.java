package com.sj.springbootforbeginners.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping(value = "/filterChar")
    public String filterChar(String input, char remove) {
        String newWord= "";
        for(int i = 0 ; i < input.length(); i++){
            if(input.charAt(i) != remove){
                newWord = newWord.concat(String.valueOf(input.charAt(i)));
            }
        }
        return  newWord;
    }

    @GetMapping(value = "/listStatement")
    public String statement(String statement, char skip){
        String[] breakStatement = statement.split(" ");
        List<String> list = new ArrayList<>();
        for(int i = 0; i < breakStatement.length; i++){
            list.add(breakStatement[i]);
        }
        String finalStatement="";
        for(String elementCheck: breakStatement){
            if(!elementCheck.contains(String.valueOf(skip))){
                finalStatement = finalStatement.concat(elementCheck).concat(" ");
            }
        }
    return finalStatement;
    }

}
