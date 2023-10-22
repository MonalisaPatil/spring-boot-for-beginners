package com.sj.springbootforbeginners.service;

import com.sj.springbootforbeginners.model.ShoppingTrend;
import com.sj.springbootforbeginners.model.ecommerce.cartHasProdcuts.CartHasProducts;
import com.sj.springbootforbeginners.model.ecommerce.category.Category;
import com.sj.springbootforbeginners.model.ecommerce.options.Option;
import com.sj.springbootforbeginners.model.ecommerce.order.Order;
import com.sj.springbootforbeginners.model.ecommerce.orderHasProducts.OrderHasProducts;
import com.sj.springbootforbeginners.model.ecommerce.orderPlacedCredicCard.OrderPlacedCreditCard;
import com.sj.springbootforbeginners.model.ecommerce.orderPlacedUser.OrderPlacedUser;
import com.sj.springbootforbeginners.model.ecommerce.product.Product;
import com.sj.springbootforbeginners.model.ecommerce.productBelongCategory.ProductBelongsCategory;
import com.sj.springbootforbeginners.model.ecommerce.productHasOptions.ProductHasOptions;
import com.sj.springbootforbeginners.model.ecommerce.productSoldVendor.ProductSoldVendor;
import com.sj.springbootforbeginners.model.ecommerce.shoppingCart.ShoppingCart;
import com.sj.springbootforbeginners.model.ecommerce.user.User;
import com.sj.springbootforbeginners.model.ecommerce.userHasCreditCard.UserHasCreditCard;
import com.sj.springbootforbeginners.model.ecommerce.vendor.Vendor;
import com.sj.springbootforbeginners.repository.*;
import com.sj.springbootforbeginners.util.GenericDataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class DataLoaderService {

    @Autowired
    private ShoppingTrendsRepository shoppingTrendsRepository;
    @Autowired
    private CartHasProductRepository cartHasProductRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private OptionsRepository optionsRepository;
    @Autowired
    private OrderHasProductsRepository orderHasProductsRepository;
    @Autowired
    private OrderPlacedCreditCardRepository orderPlacedCreditCardRepository;
    @Autowired
    private OrderPlacedUsersRepository orderPlacedUsersRepository;
    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private ProductBelongCategoryRepository productBelongCategoryRepository;
    @Autowired
    private ProductHasOptionsRepository productHasOptionsRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductSoldVendorsRepository productSoldVendorsRepository;
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;
    @Autowired
    private UserHasCreditCardRepository userHasCreditCardRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private VendorRepository vendorRepository;

    public void LoadShoppingTrends(){
        try {
            List<ShoppingTrend> shoppingTrends = GenericDataLoader.getResourceList("shopping/shopping_trends_updated.json", ShoppingTrend.class);
            shoppingTrendsRepository.saveAll(shoppingTrends);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadEcommerceData() {
        try {
            List<CartHasProducts> cartHasProducts = GenericDataLoader.getResourceList("ecommerce/carts_has_products.json", CartHasProducts.class);
            List<Category> categories = GenericDataLoader.getResourceList("ecommerce/category.json", Category.class);
            List<Option> options = GenericDataLoader.getResourceList("ecommerce/option.json", Option.class);
            List<Order> orders = GenericDataLoader.getResourceList("ecommerce/order.json", Order.class);
            List<OrderHasProducts> orderHasProducts = GenericDataLoader.getResourceList("ecommerce/orders_has_products.json", OrderHasProducts.class);
            List<OrderPlacedCreditCard> orderPlacedCreditCards = GenericDataLoader.getResourceList("ecommerce/orders_paid_creditcard.json", OrderPlacedCreditCard.class);
            List<OrderPlacedUser> orderPlacedUsers = GenericDataLoader.getResourceList("ecommerce/orders_placed_user.json", OrderPlacedUser.class);
            List<ProductSoldVendor> productSoldVendors = GenericDataLoader.getResourceList("ecommerce/product_sold_vendor.json", ProductSoldVendor.class);
            List<Product> products = GenericDataLoader.getResourceList("ecommerce/products.json", Product.class);
            List<ProductBelongsCategory> productBelongsCategories = GenericDataLoader.getResourceList("ecommerce/products_belong_category.json", ProductBelongsCategory.class);
            List<ProductHasOptions> productHasOptions = GenericDataLoader.getResourceList("ecommerce/products_has_options.json", ProductHasOptions.class);
            List<ShoppingCart> shoppingCarts = GenericDataLoader.getResourceList("ecommerce/shoppingcart.json", ShoppingCart.class);
            List<User> users = GenericDataLoader.getResourceList("ecommerce/user.json", User.class);
            List<UserHasCreditCard> userHasCreditCards = GenericDataLoader.getResourceList("ecommerce/user_has_creditcard.json", UserHasCreditCard.class);
            List<Vendor> vendors = GenericDataLoader.getResourceList("ecommerce/vendor.json", Vendor.class);

            cartHasProductRepository.saveAll(cartHasProducts);
            categoryRepository.saveAll(categories);
            optionsRepository.saveAll(options);
            ordersRepository.saveAll(orders);
            orderHasProductsRepository.saveAll(orderHasProducts);
            orderPlacedCreditCardRepository.saveAll(orderPlacedCreditCards);
            orderPlacedUsersRepository.saveAll(orderPlacedUsers);
            productSoldVendorsRepository.saveAll(productSoldVendors);
            productRepository.saveAll(products);
            productBelongCategoryRepository.saveAll(productBelongsCategories);
            productHasOptionsRepository.saveAll(productHasOptions);
            shoppingCartRepository.saveAll(shoppingCarts);
            userRepository.saveAll(users);
            userHasCreditCardRepository.saveAll(userHasCreditCards);
            vendorRepository.saveAll(vendors);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
