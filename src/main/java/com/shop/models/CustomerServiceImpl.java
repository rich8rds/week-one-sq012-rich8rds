package com.shop.models;

import com.shop.exceptions.OutOfStockException;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    StaffServiceImpl staffService = new StaffServiceImpl();
    List<Product> cartItems = new ArrayList<>();

    @Override
    public String addProductToCart(Product product, int quantity) throws OutOfStockException, IllegalArgumentException {
        if(quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative");
        if (product.getQuantityInStock() == 0) throw new OutOfStockException("OUT OF STOCK");
        else if (quantity > product.getQuantityInStock())
            return "You can only order " + product.getQuantityInStock() + " items of " + product.getProductName();
        else {
            cartItems.add(new Product(product.getProductId(), product.getProductName(),
                product.getPrice(), quantity, product.getCategory()));
            product.setQuantityInStock(product.getQuantityInStock() - quantity);
            return product.getProductName() + "(" + quantity + ") added to cart";
        }
    }

    @Override
    public String buyProduct(Customer customer) {
        if(cartItems.isEmpty()) return "Your Cart is empty!";
        if(staffService.sellProducts(customer, cartItems).equals("Cleared"))
            return "Thank you for shopping with us!";
        return "Insufficient Funds!";
    }

    public List<Product> getCartItems() {
        return cartItems;
    }
}
