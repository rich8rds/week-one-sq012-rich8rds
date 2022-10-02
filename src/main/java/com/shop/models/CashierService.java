package com.shop.models;

import com.shop.models.Customer;
import com.shop.models.Product;

import java.util.List;

public interface CashierService {
    String sellProducts(Customer customer, List<Product> cartItems);
    void issueReceipt(Customer customer, List<Product> cartItems);
}
