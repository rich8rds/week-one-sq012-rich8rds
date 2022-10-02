package com.shop.models;

import com.shop.enums.Qualification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StaffServiceImplTest {
    CompanyDB companyDB = new CompanyDB();
    StaffServiceImpl staffService = new StaffServiceImpl();

    @Test
    @DisplayName("Checks the customer's account balance before issuing receipt.")
    void issueReceipt() {
        Address address1 = new Address("Polly Street", "Ikeja", "Lagos");
        Customer customer1 = new Customer("CUST893", "John", "Larson",
                234814098123L, "larson@gmail.com", address1, 2_000_000);

        List<Product> cartItems = new ArrayList<>();
        Product product1 = companyDB.getProducts().get(2);
        Product product2 = companyDB.getProducts().get(2);

        cartItems.add(new Product(product1.getProductId(), product1.getProductName(), product1.getPrice(), 2));
        cartItems.add(new Product(product2.getProductId(), product2.getProductName(), product2.getPrice(), 1));
        String result = staffService.sellProducts(customer1, cartItems);

        assertEquals("Cleared", result);
    }

    @Test
    void hireCashier() { Address tomAddress = new Address("Rabbi Street", "Port Harcourt", "Rivers");
        Applicant applicant = new Applicant("AP095", "Thompson", "Leke",
                234814098123L, "kolade.lola@gmail.com", tomAddress, Qualification.HND, 2);

        assertTrue(staffService.hireCashier(applicant), "Applicant's application not successful!");
    }
}