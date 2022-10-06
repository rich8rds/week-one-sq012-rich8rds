package com.shop.models;

import com.shop.exceptions.OutOfStockException;

public interface CustomerService {
    String addProductToCart(Product product, int quantity) throws OutOfStockException;
    String buyProduct(Customer customer);

}
