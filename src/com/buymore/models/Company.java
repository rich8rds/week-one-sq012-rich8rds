package com.buymore.models;

import com.buymore.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Company implements CompanyInterface {
    List<Staff> staffList;
    List<Product> products;
    List<Customer> customers;
    List<StaffInterface> staffInterfaces;
    List<CustomerInterface> customerInterfaces;
    public Company(List<Staff> staffList, List<Product> products, List<Customer> customers) {
        this.staffList = staffList;
        this.products = products;
        this.customers = customers;
        this.customerInterfaces = new ArrayList<>(customers);
        this.staffInterfaces = new ArrayList<>(staffList);
    }


    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public void getListOfProducts() {
        int count = 0;
        for(Product p : products) {
            System.out.print(++count + ": "+p.getProductId() + "\t" + p.getProductName() + "\t"
                    + p.getPrice() + "\t\t\t" + p.getQuantityInStock() + "\n");
        }
        System.out.println();
    }
}
