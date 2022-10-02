package com.shop;

import com.shop.enums.Qualification;
import com.shop.models.Customer;
import com.shop.models.CustomerServiceImpl;
import com.shop.models.CompanyDB;
import com.shop.models.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CompanyDB companyDB = new CompanyDB();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        List<Product> productList = companyDB.getProducts();
        List<Customer> customers = companyDB.getCustomers();

        System.out.println(customerService.addProductToCart(productList.get(0), 3));
        System.out.println(customerService.addProductToCart(productList.get(4), 4));

        System.out.println(customerService.buyProduct(customers.get(2)));

        Address tomAddress = new Address("Rabbi Street", "Port Harcourt", "Rivers");
        Applicant applicant3 = new Applicant("AP095", "Thompson", "Leke",
                234814098123L, "kolade.lola@gmail.com", tomAddress, Qualification.HND, 5);

        ApplicantServiceImpl applicantService = new ApplicantServiceImpl();
        System.out.println(applicantService.apply(applicant3));
    }
}
