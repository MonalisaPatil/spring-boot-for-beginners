package com.sj.springbootforbeginners.service;

import com.sj.springbootforbeginners.model.ShoppingTrend;
import com.sj.springbootforbeginners.repository.ShoppingTrendsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingTrendsServiceImpl implements ShoppingTrendsService {
    @Autowired
    ShoppingTrendsRepository shoppingTrendsRepository;

    @Override
    public List<Integer> getCustomerWrtLessThanGivenAge(int Age) {
        List<ShoppingTrend> all = shoppingTrendsRepository.findAll();
        List<Integer> ageLessThan = new ArrayList<>();
        for (ShoppingTrend temp : all) {
            if (temp.getAge() <= Age) {
                ageLessThan.add(temp.getCustomerID());
            }
        }
        return ageLessThan;
    }

    public List<Integer> getCustomerWrtPurchaseFrequency(String Frequency) {
        List<ShoppingTrend> allCustomer = shoppingTrendsRepository.findAll();
        List<Integer> customerFrequency = new ArrayList<>();
        for (ShoppingTrend temp : allCustomer) {
            if (temp.getFrequencyOfPurchases().equalsIgnoreCase(Frequency)) {
                customerFrequency.add(temp.getCustomerID());
            }
        }
        return customerFrequency;
    }

    public List<String> getUniqueFrequency() {
        List<ShoppingTrend> allCustomer = shoppingTrendsRepository.findAll();
        List<String> uniqueFrequency = new ArrayList<>();
        for (ShoppingTrend temp : allCustomer) {
            if (!uniqueFrequency.contains(temp.getFrequencyOfPurchases())) {
                uniqueFrequency.add(temp.getFrequencyOfPurchases());
            }
        }
        return uniqueFrequency;

    }

    public List<String> getItemPurchasedWrtReview(Double reviewRating) {
        List<ShoppingTrend> allCustomer = shoppingTrendsRepository.findAll();
        List<String> review = new ArrayList<>();
        for (ShoppingTrend temp : allCustomer) {
            if (temp.getReviewRating() <= reviewRating) {
                review.add(temp.getItemPurchased());
            }
        }
        return review;
    }

    public List<Integer> getCustomerWrtGivenItemColor(String Color){
        List<ShoppingTrend> allCustomer = shoppingTrendsRepository.findAll();
        List<Integer> colorGiven = new ArrayList<>();
        for (ShoppingTrend temp : allCustomer) {
            if (temp.getColor().equalsIgnoreCase(Color)){
                colorGiven.add(temp.getCustomerID());
            }
        }
        return colorGiven;
    }

}
