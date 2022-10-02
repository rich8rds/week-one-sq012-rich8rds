package com.shop.models;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    StaffServiceImpl staffService = new StaffServiceImpl();
    List<Product> cartItems = new ArrayList<>();

    @Override
    public String addProductToCart(Product product, int quantity) {
        if(product.getQuantityInStock() == 0)
            return "OUT OF STOCK";
        else if(quantity > product.getQuantityInStock())
            return "You can only order "+ product.getQuantityInStock() + " items of " + product.getProductName();
        else {
            cartItems.add(new Product(product.getProductId(), product.getProductName(),
                    product.getPrice(), quantity));
            product.setQuantityInStock(product.getQuantityInStock() - quantity);
            return product.getProductName()+ "("+quantity+") added to cart";
        }
    }


    @Override
    public String buyProduct(Customer customer) {
        if(staffService.sellProducts(customer, cartItems).equals("Cleared"))
            return "Thank you for shopping with us!";
        return "Insufficient Funds!";
    }
}
