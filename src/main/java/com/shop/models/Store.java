package com.shop.models;

import com.shop.csv.StoreProducts;
import com.shop.enums.Category;
import com.shop.enums.Products;
import com.shop.enums.Qualification;
import com.shop.enums.Role;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Store {
    StoreProducts storeProducts;

    public Store() {
        this.storeProducts = new StoreProducts();
    }

    public List<Applicant> getApplicants() {
        //APPLICANTS
        Address maxAddress = new Address("Oliver Saunders Street", "Idumota", "Lagos");
        Applicant applicant1 = new Applicant("AP093", "John", "Maxwell",
                234814098123L, "johnMaxwell@gmail.com", maxAddress, Qualification.OND, 3);

        Address sylviaAddress = new Address("Timbot Street", "Lokoja", "Kogi");
        Applicant applicant2 = new Applicant("AP094", "Reinhard", "Brent",
                234814098123L, "reinhard.Brent@gmail.com", sylviaAddress, Qualification.HND, 1);

        return new ArrayList<>(List.of(applicant1, applicant2));
    }

    public List<Customer> getCustomers() {
        //CUSTOMERS
        Address address1 = new Address("Polly Street", "Ikeja", "Lagos");
        Customer customer1 = new Customer("CUST893", "John", "Larson",
                234814098123L, "larson@gmail.com", address1, 100);

        Address address2 = new Address("Makinde Street", "Ibadan", "Oyo");
        Customer customer2 = new Customer("CUST894", "Innocent", "Peters",
                234814098123L, "innocent.peters@gmail.com", address2, 500_000);

        Address address3 = new Address("Ohen Street", "Benin", "Edo");
        Customer customer3 = new Customer("CUST895", "Kola", "Lolade",
                234814098123L, "kolade.lola@gmail.com", address3, 1_000_000);

        Address address4 = new Address("Preacher Street", "Kansas", "Wisconsin");
        Customer customer4 = new Customer("CUST898", "Irene", "Adler",
                234814098123L, "adam.lola@gmail.com", address3, 500_000);

        return new ArrayList<>(List.of(customer1, customer2, customer3, customer4));
    }

    public List<Staff> getStaff() {
             //STAFF
        Address staffAddress1 = new Address("Johnson Rick Area", "Lekki", "Lagos");
        Staff manager = new Staff("MAN001", "Korede", "Bello",
                23480184657L, "korede.bello@gmail.com", Role.MANAGER, staffAddress1);

        Address staffAddress2 = new Address("Shalom Area", "Lekki", "Lagos");
        Staff cashier = new Staff("CASH001", "Clark", "Kent",
                23484938266L, "korede.bello@gmail.com", Role.CASHIER, staffAddress2);

        return new ArrayList<>(List.of(manager, cashier));
    }

    public StoreProducts getStoreProducts() {
        return storeProducts;
    }

    public void setStoreProducts(StoreProducts storeProducts) {
        this.storeProducts = storeProducts;
    }
}
