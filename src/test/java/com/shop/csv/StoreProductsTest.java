package com.shop.csv;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreProductsTest {
    StoreProducts storeProducts = new StoreProducts();
    String filename = "src//resources//productDataTest.csv";


    @Test
    void readProductListFromFile() {
        storeProducts.readProductListFromFile(filename);
    }

    @Test
    @DisplayName("Show true if writing is successful and false if error found.")
    void writeToFile() {
        assertTrue(storeProducts.writeToFile(filename));
        System.out.println(storeProducts.getProducts());
    }

    @Test
    void writeNewProductUpdatesToFile() {
        assertTrue(storeProducts.writeNewProductUpdatesToFile(filename));
    }
}