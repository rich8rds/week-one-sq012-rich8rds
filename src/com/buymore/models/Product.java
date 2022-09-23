package com.buymore.models;

import com.buymore.enums.Products;

public class Product {
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
}
