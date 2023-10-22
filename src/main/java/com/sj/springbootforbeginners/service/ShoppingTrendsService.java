package com.sj.springbootforbeginners.service;

import java.util.List;

public interface ShoppingTrendsService {

    public List<Integer> getCustomerWrtLessThanGivenAge(int Age);

    public List<Integer>  getCustomerWrtPurchaseFrequency(String Frequency);

    public List<String> getUniqueFrequency();

    public List<String> getItemPurchasedWrtReview(Double reviewRating);

    public List<Integer>  getCustomerWrtGivenItemColor(String Color);





    }
