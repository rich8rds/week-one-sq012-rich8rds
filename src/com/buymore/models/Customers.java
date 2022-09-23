package com.buymore.models;

import com.buymore.composite.Address;

public class Customers extends Person {
    private String customerId;

    public Customers(String firstName, String lastName, long phoneNumber, String email, Address address) {
        super(firstName, lastName, phoneNumber, email, address);
    }

    public Customers(String customerId, String firstName, String lastName, long phoneNumber, String email, Address address) {
        super(firstName, lastName, phoneNumber, email, address);
        this.customerId = customerId;
    }

    public String buyProduct() {
        return "receipt and list of products plus payments";
    }

    public String getCustomerId() {
        return customerId;
    }
}
