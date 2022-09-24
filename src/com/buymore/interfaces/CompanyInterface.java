package com.buymore.interfaces;

import com.buymore.models.Customer;
import com.buymore.models.Product;
import com.buymore.models.Staff;

import java.util.List;

public interface CompanyInterface {
    void getListOfProducts();
    List<Staff> getStaffList();

    void setStaffList(List<Staff> staffList);

    List<Product> getProducts();

    void setProducts(List<Product> products);

    List<Customer> getCustomers();

    void setCustomers(List<Customer> customers);
}
