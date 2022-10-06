package com.shop.models;

import com.shop.enums.Role;
import com.shop.models.Address;
import com.shop.models.Person;
import com.shop.models.Product;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private String customerId;
    private Role role;
    private double balance;

    public Customer(String customerId, String firstName,
                    String lastName, long phoneNumber,
                    String email, Address address, double balance) {
        super(firstName, lastName, phoneNumber, email, address);
        this.customerId = customerId;
        this.role = Role.CUSTOMER;
        this.balance = balance;
    }



    public double getBalance() {
        return balance;
    }

    public String getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + "\n" +
                this.getEmail() + "\n" + this.getPhoneNumber() + "\n" +
                this.getAddress();
    }
}
