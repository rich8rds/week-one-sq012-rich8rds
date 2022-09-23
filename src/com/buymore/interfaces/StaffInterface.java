package com.buymore.interfaces;

import com.buymore.models.Customer;
import com.buymore.models.Product;

import java.util.List;

public interface StaffInterface {
    List<Product> getProductList();
    List<Customer> getCustomerList();
}
