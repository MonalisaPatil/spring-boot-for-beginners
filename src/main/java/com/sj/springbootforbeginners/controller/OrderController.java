package com.sj.springbootforbeginners.controller;


import com.sj.springbootforbeginners.model.ecommerce.order.Order;
import com.sj.springbootforbeginners.model.orderResponse.Response;
import com.sj.springbootforbeginners.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping(value = "/getOrderDetailsbyOrderId", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getOrderDetailsbyOrderId(@RequestParam String orderId){
        return  orderService.getOrderDetailsbyOrderId(orderId);
    }

}
