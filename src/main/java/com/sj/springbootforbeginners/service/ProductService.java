package com.sj.springbootforbeginners.service;

import com.sj.springbootforbeginners.model.ecommerce.category.Category;
import com.sj.springbootforbeginners.model.ecommerce.product.Product;
import com.sj.springbootforbeginners.model.ecommerce.product.ProductResponse;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ProductService {

    public List<Category> getCategory();

    public List<Product> getProductWrtCategory(int category);

    public ProductResponse getProductInfo(int productId);

    public List<ProductResponse> getAllProductInfo();

    public List<ProductResponse> getAllProductPriceByProductInfo(int price);

    public ProductResponse getProductByPrice( int productId, int price);




    }
