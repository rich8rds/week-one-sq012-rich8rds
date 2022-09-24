package com.buymore.interfaces;

import com.buymore.models.Product;

public interface CustomerInterface {
    void buyProducts();
    void addToCart(Product product, int quantity);
    void getListOfProducts();
    void viewCart();
    void removeFromCart(Product product);

}
