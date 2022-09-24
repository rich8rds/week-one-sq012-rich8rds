package com.buymore;

import com.buymore.composite.Address;
import com.buymore.enums.Products;
import com.buymore.enums.Role;
import com.buymore.interfaces.*;
import com.buymore.models.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //CUSTOMERS
        Address address1 = new Address("Polly Street", "Ikeja", "Lagos");
        Customer customer1 = new Customer("CUST893", "John", "Larson",
                234814098123L, "larson@gmail.com", address1);

        Address address2 = new Address("Makinde Street", "Ibadan", "Oyo");
        Customer customer2 = new Customer("CUST894", "Innocent", "Peters",
                234814098123L, "innocent.peters@gmail.com", address2);

        Address address3 = new Address("Ohen Street", "Benin", "Edo");
        Customer customer3 = new Customer("CUST895", "Kola", "Lolade",
                234814098123L, "kolade.lola@gmail.com", address3);
        List<Customer> customerList = List.of(customer1, customer2, customer3);
        System.out.println(customer2);

        //STAFF
        Address staffAddress1 = new Address("Johnson Rick Area", "Lekki", "Lagos");
        Staff manager = new Staff("MAN001", "Korede", "Bello",
                23480184657L, "korede.bello@gmail.com", Role.MANAGER, staffAddress1);

        Address staffAddress2 = new Address("Shalom Area", "Lekki", "Lagos");
        Staff cashier = new Staff("CASH001", "Clark", "Kent",
                23484938266L, "korede.bello@gmail.com", Role.CASHIER, staffAddress2);

        List<Staff> staffList = List.of(manager, cashier);

        //PRODUCTS
        Product television = new Product("PROD384", Products.MONITOR, 100000d, 4);
        Product refrigerator = new Product("PROD385", Products.FRIDGE, 150000d, 2);
        Product electricKettle = new Product("PROD386", Products.KETTLE, 500000d, 8);
        Product heater = new Product("PROD387", Products.HEATER, 200000d, 5);
        Product iron = new Product("PROD388", Products.IRON, 100000d, 7);
        Product stove = new Product("PROD388", Products.STOVE, 120000d, 1);
        Product soundSystem = new Product("PROD388", Products.SPEAKER, 180000d, 2);

        List<Product> productList = List.of(television, refrigerator, electricKettle, heater, iron, stove, soundSystem);

        //INIT INTERFACES CLASS
        CompanyInterface companyInterface = new Company(staffList, productList, customerList);
        ManagerInterface managerInterface = manager;
        CashierInterface cashierInterface = cashier;
        CustomerInterface customerInterface =  customer1;

        cashier.setCustomerInterface(customerInterface);

        customer1.setCashierInterface(cashierInterface);
        customer1.setCompanyInterface(companyInterface);

        customerInterface.getListOfProducts();
        customerInterface.addToCart(productList.get(1), 2);
        customerInterface.addToCart(productList.get(3), 1);
        customerInterface.viewCart();

        customerInterface.buyProducts();


    }
}