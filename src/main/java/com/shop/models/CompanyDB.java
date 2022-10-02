package com.shop.models;

import com.shop.enums.Products;
import com.shop.enums.Qualification;
import com.shop.enums.Role;


import java.util.ArrayList;
import java.util.List;

public class CompanyDB {
//    public List<Applicant> getApplicants() {
//        //APPLICANTS
//        Address maxAddress = new Address("Oliver Saunders Street", "Idumota", "Lagos");
//        Applicant applicant1 = new Applicant("AP093", "John", "Maxwell",
//                234814098123L, "johnMaxwell@gmail.com", maxAddress, Qualification.OND, 3);
//
//        Address sylviaAddress = new Address("Timbot Street", "Lokoja", "Kogi");
//        Applicant applicant2 = new Applicant("AP094", "Reinhard", "Brent",
//                234814098123L, "reinhard.Brent@gmail.com", sylviaAddress, Qualification.HND, 1);
//
//        return new ArrayList<>(List.of(applicant1, applicant2));
//    }

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
        return new ArrayList<>(List.of(customer1, customer2, customer3));

    }

    public List<Product> getProducts() {
        //PRODUCTS
        Product television = new Product("PROD384", Products.MONITOR, 100000d, 4);
        Product refrigerator = new Product("PROD385", Products.FRIDGE, 150000d, 2);
        Product electricKettle = new Product("PROD386", Products.KETTLE, 500000d, 8);
        Product heater = new Product("PROD387", Products.HEATER, 200000d, 5);
        Product iron = new Product("PROD388", Products.IRON, 100000d, 7);
        Product stove = new Product("PROD388", Products.STOVE, 120000d, 1);
        Product soundSystem = new Product("PROD388", Products.SPEAKER, 180000d, 2);

        return new ArrayList<>(List.of(television, refrigerator, electricKettle, heater, iron, stove, soundSystem));
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
}
