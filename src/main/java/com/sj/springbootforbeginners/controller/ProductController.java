package com.sj.springbootforbeginners.controller;

import com.sj.springbootforbeginners.model.ecommerce.category.Category;
import com.sj.springbootforbeginners.model.ecommerce.product.Product;
import com.sj.springbootforbeginners.model.ecommerce.product.ProductResponse;
import com.sj.springbootforbeginners.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductServiceImpl productServiceImpl;

    @GetMapping(value = "/getCategory", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Category> getCategory(){
        return productServiceImpl.getCategory();
    }

    @GetMapping (value= "/getProductWrtCategory", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProductWrtCategory(int categoryId){
        return productServiceImpl.getProductWrtCategory(categoryId);
    }

    @GetMapping (value = "/getProductInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductResponse getProductInfo(@RequestParam int productId){
        return productServiceImpl.getProductInfo(productId);
    }

// TODO: 10/25/23 write a endpoint to get the productInfo based on the given productId and abiding the given response structurte

}
