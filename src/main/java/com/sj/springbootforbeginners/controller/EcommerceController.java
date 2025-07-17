package com.sj.springbootforbeginners.controller;

import com.sj.springbootforbeginners.model.Customer;
import com.sj.springbootforbeginners.model.ShoppingTrend;
import com.sj.springbootforbeginners.repository.ShoppingTrendsRepository;
import com.sj.springbootforbeginners.service.ShoppingTrendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ecommerce")
public class EcommerceController {

    @Autowired
    ShoppingTrendsService shoppingTrendsService;

    @Autowired
    ShoppingTrendsRepository shoppingTrendsRepository;


    @GetMapping(value = "/getCustomerWrtLessThanGivenAge", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Integer> getCustomerWrtLessThanGivenAge(int Age) {
        return shoppingTrendsService.getCustomerWrtLessThanGivenAge(Age);
    }

    @GetMapping(value = "/getCustomerWrtPurchaseFrequency", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Integer> getCustomerWrtPurchaseFrequency(String Frequency) {
        return shoppingTrendsService.getCustomerWrtPurchaseFrequency(Frequency);
    }

    @GetMapping(value = "/getUniqueFrequency", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getUniqueFrequency() {
        return shoppingTrendsService.getUniqueFrequency();
    }

    @GetMapping(value = "/getItemPurchasedWrtReview", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getItemPurchasedWrtReview(Double reviewRating) {
        return shoppingTrendsService.getItemPurchasedWrtReview(reviewRating);
    }

    @GetMapping(value = "/getCustomerWrtGivenItemColor", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Integer> getCustomerWrtGivenItemColor(String Color) {
        return shoppingTrendsService.getCustomerWrtGivenItemColor(Color);
    }


    @GetMapping(value = "/custom/getAllShoppingTrendData", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ShoppingTrend> getAllShoppingTrendData() {
        List<ShoppingTrend> shoppingTrends = shoppingTrendsRepository.findAll();
        return shoppingTrends;
    }

    @GetMapping(value = "/custom/basedOnSeason", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ShoppingTrend> getCustomerBasedOnSeason(String season) {
        List<ShoppingTrend> filteredShoppingTrends = new ArrayList<>();
        List<ShoppingTrend> shoppingTrends = shoppingTrendsRepository.findAll();
        for (ShoppingTrend S : shoppingTrends) {
            if (S.getSeason().equalsIgnoreCase(season)) {
                filteredShoppingTrends.add(S);
            }
        }
        return filteredShoppingTrends;
    }

    // TODO: 10/21/23 write a program  to extract all the customers ids whose age is lesser than given input
    @GetMapping(value = "/custom/basedOnAgeRange", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Integer> getCustomerBasedOnAgeRange(int age) {
        List<Integer> customerIdList = new ArrayList<>();
        List<ShoppingTrend> shoppingTrends = shoppingTrendsRepository.findAll();
        for (ShoppingTrend S : shoppingTrends) {
            if (S.getAge() < age) {
                customerIdList.add(S.getCustomerID());
            }
        }
        return customerIdList;
    }

    // TODO: 10/21/23  write a program  to extract all the  customer ids whose purchase frequency is annually::
    @GetMapping(value = "/custom/basedOnPurchaseFrequency", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Integer> getCustomerBasedOnPurchaseFrequency() {
        List<Integer> annuallyPurchaseCustomerIdList = new ArrayList<>();
        List<ShoppingTrend> shoppingTrends = shoppingTrendsRepository.findAll();
        for (ShoppingTrend S : shoppingTrends) {
            if (S.getFrequencyOfPurchases().equalsIgnoreCase("annually")) {
                annuallyPurchaseCustomerIdList.add(S.getCustomerID());
            }
        }
        return annuallyPurchaseCustomerIdList;
    }

    // TODO: 10/21/23  write a program  to extract the all the shopped items whose review rating is less than given input::
    @GetMapping(value = "/custom/basedOnReviewRatings", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getItemsBasedOnReviewRatings(double rate) {
        List<String> itemsBasedOnRatingsList = new ArrayList<>();
        List<ShoppingTrend> shoppingTrends = shoppingTrendsRepository.findAll();
        for (ShoppingTrend S : shoppingTrends) {
            if (S.getReviewRating() < rate) {
                itemsBasedOnRatingsList.add(S.getItemPurchased());

            }

        }
        return itemsBasedOnRatingsList;
    }


    // TODO: 10/21/23  write a program  to extract the all the customer ids that shopped items of given color;
    @GetMapping(value = "/custom/basedOnColor", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Integer> getItemsBasedOnColor(String color) {
        List<Integer> itemsBasedOnColorList = new ArrayList<>();
        List<ShoppingTrend> shoppingTrends = shoppingTrendsRepository.findAll();
        for (ShoppingTrend S : shoppingTrends) {
            if (S.getColor().equalsIgnoreCase(color)) {
                itemsBasedOnColorList.add(S.getCustomerID());

            }
        }
        return itemsBasedOnColorList;

    }

// TODO: 10/21/23  write a program  to extract the all the unique frequency of purchase
    @GetMapping(value = "/custom/UniquePurchaseFrequency", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getUniquePurchaseFrequency() {
        List<String> UniquePurchaseFrequency = new ArrayList<>();
        List<ShoppingTrend> shoppingTrends = shoppingTrendsRepository.findAll();
        for(ShoppingTrend S : shoppingTrends){
            if(!UniquePurchaseFrequency.contains(S.getFrequencyOfPurchases())){
                UniquePurchaseFrequency.add(S.getFrequencyOfPurchases());
            }
        }
        return UniquePurchaseFrequency;
    }
}












