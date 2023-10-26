package com.sj.springbootforbeginners.service;

import com.sj.springbootforbeginners.model.ecommerce.category.Category;
import com.sj.springbootforbeginners.model.ecommerce.product.Product;
import com.sj.springbootforbeginners.model.ecommerce.product.ProductOptionsItem;
import com.sj.springbootforbeginners.model.ecommerce.product.ProductResponse;
import com.sj.springbootforbeginners.model.ecommerce.product.ProductVendor;
import com.sj.springbootforbeginners.model.ecommerce.productHasOptions.ProductHasOptions;
import com.sj.springbootforbeginners.model.ecommerce.productSoldVendor.ProductSoldVendor;
import com.sj.springbootforbeginners.model.ecommerce.vendor.Vendor;
import com.sj.springbootforbeginners.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ProductBelongCategoryRepository productBelongCategoryRepository;

    @Autowired
    ProductHasOptionsRepository productHasOptionsRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductSoldVendorsRepository productSoldVendorsRepository;

    @Autowired
    VendorRepository vendorRepository;



    @Override
    public List<Category> getCategory(){
        return categoryRepository.findAll();
    }

    @Override
    public List<Product> getProductWrtCategory(int categoryId){
        List<Integer> productId = productBelongCategoryRepository.findAllProductIdByCategory(categoryId);
        List<Product> output = new ArrayList<>();
        for(Integer temp: productId){
            output.add(productRepository.findProductsByProductId(temp));
        }
        return output;
    }

    @Override
    public ProductResponse getProductInfo(@RequestParam int productId) {
        Product product = productRepository.findProductsByProductId(productId);
        String productName = product.getProductName();
        String productDescription = product.getDescriptions();
        int productCategoryId = productBelongCategoryRepository.findCategoryIdByProductId(productId);
        String productCategoryName = categoryRepository.findCategoryNameByCategoryId(productCategoryId);
        List<ProductHasOptions> options = productHasOptionsRepository.findAllOptionsByProductId(productId);
        List<ProductOptionsItem> productOptionsItems = new ArrayList<>();
        for (ProductHasOptions temp : options) {
            ProductOptionsItem object = new ProductOptionsItem();
            object.setOptionId(temp.getOptionId());
            object.setOptionSpecification(temp.getSpecs());
            object.setAvailableQuantity(temp.getQuantity());
            productOptionsItems.add(object);
        }
        int vendorId = productSoldVendorsRepository.findVendorIdByProductId(productId);
        Vendor vendor = vendorRepository.findAllByVendorId(vendorId);
        ProductVendor productVendor = new ProductVendor();
        productVendor.setVendorEmail(vendor.getVenderEmail());
        productVendor.setVendorName(vendor.getVendorName());
        productVendor.setVendorPhone(vendor.getVendorPhone());
        productVendor.setVendorId(vendor.getVendorId());

        ProductResponse productResponse = new ProductResponse();
        productResponse.setProductId(productId);
        productResponse.setProductTitle(productName);
        productResponse.setProductDescription(productDescription);
        productResponse.setProductCategoryId(productCategoryId);
        productResponse.setProductCategory(productCategoryName);
        productResponse.setProductOptions(productOptionsItems);
        productResponse.setProductVendor(productVendor);
        return productResponse;
        }

    }
