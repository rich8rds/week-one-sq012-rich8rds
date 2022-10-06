package com.shop.models;

import com.shop.csv.StoreProducts;
import com.shop.enums.Category;
import com.shop.enums.Qualification;
import com.shop.enums.Role;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StaffServiceImplTest {
    Store companyDB = new Store();
    StoreProducts storeProducts = new StoreProducts();
    StaffServiceImpl staffService = new StaffServiceImpl();
    String filename = "src/data//productDataTest.csv";

    @Test
    @DisplayName("Checks the customer's account balance before issuing receipt.")
    void issueReceipt() {
        storeProducts.readProductListFromFile(filename);
        List<Product> products = storeProducts.getProducts();
        Address address1 = new Address("Polly Street", "Ikeja", "Lagos");
        Customer customer1 = new Customer("CUST893", "John", "Larson",
                234814098123L, "larson@gmail.com", address1, 2_000_000);

        List<Product> cartItems = new ArrayList<>();
        Product product1 = products.get(2);
        Product product2 = products.get(2);

        cartItems.add(new Product(product1.getProductId(), product1.getProductName(), product1.getPrice(),
                2, Category.ESSENTIALS));
        cartItems.add(new Product(product2.getProductId(), product2.getProductName(), product2.getPrice(),
                1, Category.ESSENTIALS));
        String result = staffService.sellProducts(customer1, cartItems);

        assertEquals("Cleared", result);
    }

    @Test
    void hireCashier() { Address tomAddress = new Address("Rabbi Street", "Port Harcourt", "Rivers");
        Applicant applicant = new Applicant("AP095", "Thompson", "Leke",
                234814098123L, "kolade.lola@gmail.com", tomAddress, Qualification.HND, 2);

        assertTrue(staffService.hireCashier(applicant, Role.CASHIER), "Applicant's application not successful!");
    }
}