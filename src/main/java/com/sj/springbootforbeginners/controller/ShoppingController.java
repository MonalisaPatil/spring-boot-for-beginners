package com.sj.springbootforbeginners.controller;

import com.sj.springbootforbeginners.model.ShoppingTrend;
import com.sj.springbootforbeginners.service.DataLoaderService;
import com.sj.springbootforbeginners.service.ShoppingTrendsService;
import com.sj.springbootforbeginners.service.ShoppingTrendsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class ShoppingController {

    @Autowired
    ShoppingTrendsService shoppingTrendsService;


    @GetMapping(value = "/getCustomerWrtLessThanGivenAge",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Integer> getCustomerWrtLessThanGivenAge(int Age){
        return shoppingTrendsService.getCustomerWrtLessThanGivenAge(Age);
    }

    @GetMapping(value ="/getCustomerWrtPurchaseFrequency" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Integer>  getCustomerWrtPurchaseFrequency(String Frequency){
        return shoppingTrendsService.getCustomerWrtPurchaseFrequency(Frequency);
    }

    @GetMapping(value ="/getUniqueFrequency" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getUniqueFrequency(){
        return  shoppingTrendsService.getUniqueFrequency();
    }

    @GetMapping(value ="/getItemPurchasedWrtReview" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getItemPurchasedWrtReview(Double reviewRating){
        return shoppingTrendsService.getItemPurchasedWrtReview(reviewRating);
    }

    @GetMapping(value ="/getCustomerWrtGivenItemColor" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Integer>  getCustomerWrtGivenItemColor(String Color){
        return shoppingTrendsService.getCustomerWrtGivenItemColor(Color);
    }



// TODO: 10/21/23 write a program  to extract all the customers whose age is lesser than given input

// TODO: 10/21/23  write a program  to extract all the  customer ids whose purchase frequency is annually

// TODO: 10/21/23  write a program  to extract the all the unique frequency of purchases
// TODO: 10/21/23  write a program  to extract the all the shopped items whose review rating is less than given input
// TODO: 10/21/23  write a program  to extract the all the customer ids that shopped items of given color;


}
