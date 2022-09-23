package com.buymore.interfaces;

import com.buymore.models.Product;

public interface CustomerInterface {
    void buyProducts();
    void addToCart(Product product);
    void getListOfProducts();
    void viewCart();
    void removeFromCart(Product product);
    void setCashierInterface(CashierInterface cashierInterface);
    void setCompanyInterface(CompanyInterface companyInterface);
}
