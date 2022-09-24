package com.buymore.interfaces;


import com.buymore.models.Customer;
import com.buymore.models.Product;

import java.util.List;

public interface CashierInterface {
    boolean sellProducts(List<Product> productIds);
    String presentReceipts(List<Product> customerCart);
    List<Product> getProductList();
    List<Customer> getCustomerList();

    void showProductsInStock();
}
