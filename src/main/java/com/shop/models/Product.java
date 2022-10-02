package com.shop.models;

import com.shop.enums.Products;

public class Product {
    private String customerId;
    private String customerName;

    private static  int count;
    private String productId;
    private Products productName;
    private int quantityInStock;
    private double price;

    public Product(String productId, Products productName, double price, int quantityInStock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public Product(String productId, Products productName, double price, int quantityInStock, String customerId, String customerName) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Products getProductName() {
        return productName;
    }

    public void setProductName(Products productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }


    @Override
    public String toString() {
        return "\t\t"+productId +
                    "\t\t\t" + productName +
                    "\t\t" + price +
                    "\t\t" + (quantityInStock == 0 ? "Out of Stock" : quantityInStock) + "\n";
    }
}
