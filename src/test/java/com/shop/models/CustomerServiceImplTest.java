package com.shop.models;

import com.shop.exceptions.OutOfStockException;
import com.shop.csv.StoreProducts;
import com.shop.enums.Category;
import com.shop.enums.Products;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest {
    StaffServiceImpl staffService = new StaffServiceImpl();
    Store companyDB = new Store();
    StoreProducts storeProducts = new StoreProducts();
    CustomerServiceImpl customerService = new CustomerServiceImpl();


    String filename = "src//resources//productDataTest.csv";

    @Test
    void addProductToCart() throws OutOfStockException {
        Product stove = new Product("PROD388", Products.WINE, 120000d, 11, Category.ESSENTIALS);
        int quantity = 11;
        assertFalse(quantity > stove.getQuantityInStock(),stove.getProductName() + " Out of Stock");

        String output = (customerService.addProductToCart(stove, quantity));
        assertEquals(stove.getProductName()+"("+ quantity +") added to cart", output);
    }

    @Test
    @DisplayName("Show \"Cleared\" when sufficient funds are available and \"Insufficient Funds!\" when not enough")
    void buyProduct() {
        storeProducts.readProductListFromFile(filename);
        List<Product> productList = storeProducts.getProducts();

        Address address1 = new Address("Polly Street", "Ikeja", "Lagos");
        Customer customer1 = new Customer("CUST893", "John", "Larson",
                234814098123L, "larson@gmail.com", address1, 200_000);

        List<Product> list = new ArrayList<>(List.of(productList.get(0), productList.get(2)));

        String result = staffService.sellProducts(customer1, list);
        System.out.println("Result: " + result);
        assertEquals("Cleared", result);
        assertNotEquals("Insufficient Funds!", result);
    }

    @Test
    @DisplayName("Test for OutOfStockException: if quantity of product is zero, throw exception")
    void checkOutOfStockException() {
        Product wine = new Product("PROD388", Products.WINE, 120000d, 0, Category.DRINK);
        assertThrows(OutOfStockException.class, () -> customerService.addProductToCart(wine, 34));
    }
    @Test
    @DisplayName("Test for IllegalArgumentException: if quantity of product is less than zero, throw exception")
    void checkIllegalArgumentException() {
        Product wine = new Product("PROD388", Products.WINE, 120000d, 0, Category.DRINK);
        assertThrows(IllegalArgumentException.class, () -> customerService.addProductToCart(wine, -12));
    }

}