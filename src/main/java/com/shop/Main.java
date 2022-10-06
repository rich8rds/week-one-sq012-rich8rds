package com.shop;

import com.shop.csv.StoreProducts;
import com.shop.enums.Qualification;
import com.shop.exceptions.OutOfStockException;
import com.shop.models.Customer;
import com.shop.models.CustomerServiceImpl;
import com.shop.models.Store;
import com.shop.models.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        StoreProducts storeProducts = store.getStoreProducts();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        StaffServiceImpl staffService = new StaffServiceImpl();
        String filename = storeProducts.getFilename();

        storeProducts.writeToFile(filename);
        if(storeProducts.readProductListFromFile(filename)) {
            displayHeader();
            System.out.println(store.getStoreProducts().getProducts());
            List<Product> productList = storeProducts.getProducts();
            List<Customer> customers = store.getCustomers();
            Customer customer = customers.get(3);

            try {
                System.out.println(customerService.addProductToCart(productList.get(11), 2));
                System.out.println(customerService.addProductToCart(productList.get(5), 4));
                System.out.println(customerService.addProductToCart(productList.get(10), 3));
                System.err.println(customerService.addProductToCart(productList.get(0), 1000)); //Throws OutOfStockException
            } catch (OutOfStockException e) {
                System.err.println("ERROR: " + e.getMessage());
            }

            if(customerService.buyProduct(customer).equals("Thank you for shopping with us!"))
                staffService.issueReceipt(customer, customerService.getCartItems());
            else System.out.println("No purchases made");

            displayHeader();
            System.out.println(store.getStoreProducts().getProducts());
            storeProducts.writeNewProductUpdatesToFile(filename);
        }else System.out.println("Error reading from filename: " + filename);


        Address tomAddress = new Address("Rabbi Street", "Port Harcourt", "Rivers");
        Applicant applicant3 = new Applicant("AP095", "Thompson", "Leke",
                234814098123L, "kolade.lola@gmail.com", tomAddress, Qualification.HND, 5);

        ApplicantServiceImpl applicantService = new ApplicantServiceImpl();
        System.out.println(applicantService.apply(applicant3));
    }

    private static void displayHeader() {
        System.out.println("*******************************************************************");
        System.out.println("AVAILABLE PRODUCTS");
        System.out.println("DATE:" + LocalDate.now());
        System.out.println("*******************************************************************");
        System.out.println("\tPRODUCT ID\t\tQUANTITY\t\t\tPRICE\t\tPRODUCT");
        System.out.println("*******************************************************************");
    }
}
