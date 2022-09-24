package com.buymore.models;

import com.buymore.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Company implements CompanyInterface {
    List<Staff> staffList;
    List<Product> products;
    List<Customer> customers;

    public Company(List<Staff> staffList, List<Product> products, List<Customer> customers) {
        this.staffList = staffList;
        this.products = products;
        this.customers = customers;
    }


    @Override
    public void getListOfProducts() {
        int count = 0;
        System.out.println("*******************************************************************");
        System.out.println("SN\t\tPRODUCT ID\t\tPRODUCT\t\tPRICE\t\tQUANTITY");
        System.out.println("*******************************************************************\n");
        for(Product p : products) {
            System.out.print(++count + ": \t\t"+p.getProductId() +
                    "\t\t\t" + p.getProductName() +
                    "\t\t" + p.getPrice() +
                    "\t\t" + p.getQuantityInStock() + "\n");
        }
        System.out.println("\n*******************************************************************");
        System.out.println();
    }

    @Override
    public List<Staff> getStaffList() {
        return staffList;
    }

    @Override
    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
