package com.sj.springbootforbeginners.service;

import com.sj.springbootforbeginners.model.ecommerce.order.Order;
import com.sj.springbootforbeginners.model.ecommerce.orderHasProducts.OrderHasProducts;
import com.sj.springbootforbeginners.model.ecommerce.productHasOptions.ProductHasOptions;
import com.sj.springbootforbeginners.model.ecommerce.user.User;
import com.sj.springbootforbeginners.model.orderResponse.Pricing;
import com.sj.springbootforbeginners.model.orderResponse.Response;
import com.sj.springbootforbeginners.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrdersRepository ordersRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserHasCreditCardRepository userHasCreditCardRepository;

    @Autowired
    OrderHasProductsRepository orderHasProductsRepository;

    @Autowired
    ProductHasOptionsRepository productHasOptionsRepository;


    public Response getOrderDetailsbyOrderId(String orderId){
        Order order =  ordersRepository.findByOrderIdString(orderId);
        String orderName = order.getShipName();
        int orderNumber = order.getOrderNumber();
        int quantity = order.getNumberOfItems();
        User creditCardUser = userRepository.findUserByUserName(orderName);
        Long creditCardNumber = userHasCreditCardRepository.findCreditCardByUSerID(creditCardUser.getUserId());
        List<OrderHasProducts> products= orderHasProductsRepository.findProuctIdByOrderId(orderNumber);
        List<Integer> price = new ArrayList<>();
        List<Integer> skus = new ArrayList<>();
        for(OrderHasProducts temp: products){
            price.add(productHasOptionsRepository.findPriceByProductIdAndOptionId(temp.getProductId(), temp.getOption_id()));
            skus.add(temp.getOption_id());
        }
        Response response = new Response();
        response.setOrderId(orderId);
        response.setUser(orderName);
        response.setCreditCardNumber(String.valueOf(creditCardNumber));
        response.setQuantity(String.valueOf(quantity));
        response.setSkus(skus);
        Pricing pricing = new Pricing();
        int sum = 0;
        for(int temp: price){
            sum = sum+ temp;
        }
        pricing.setIndividualPrice(Double.valueOf(sum));
        pricing.setDiscountApplied(Double.valueOf(15));
        pricing.setPriceWithTax(Double.valueOf(order.getOrderTotalCost()));
        response.setPricing(pricing);
        return response;
    }





    }
