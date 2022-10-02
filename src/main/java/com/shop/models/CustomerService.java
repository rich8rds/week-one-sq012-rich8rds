package com.shop.models;

public interface CustomerService {
    String addProductToCart(Product product, int quantity);
    String buyProduct(Customer customer);
}
