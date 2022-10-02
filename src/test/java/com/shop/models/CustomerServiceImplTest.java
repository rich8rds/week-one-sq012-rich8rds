package com.shop.models;

import com.shop.enums.Products;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest {
    StaffServiceImpl staffService = new StaffServiceImpl();
    CompanyDB companyDB = new CompanyDB();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    List<Product> productList = companyDB.getProducts();

    @Test
    void addProductToCart() {
        Product stove = new Product("PROD388", Products.STOVE, 120000d, 11);
        int quantity = 11;
        assertFalse(quantity > stove.getQuantityInStock(),stove.getProductName() + " Out of Stock");

        String output = (customerService.addProductToCart(stove, quantity));
        assertEquals(stove.getProductName()+"("+ quantity +") added to cart", output);
    }

    @Test
    void buyProduct() {
        Address address1 = new Address("Polly Street", "Ikeja", "Lagos");
        Customer customer1 = new Customer("CUST893", "John", "Larson",
                234814098123L, "larson@gmail.com", address1, 2_000_000);

        List<Product> list = new ArrayList<>(List.of(productList.get(0), productList.get(2)));

        String result = staffService.sellProducts(customer1, list);
        System.out.println("Result: " + result);
        assertEquals("Insufficient Funds!", result);
    }
}