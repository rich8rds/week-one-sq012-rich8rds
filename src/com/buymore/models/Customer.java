package com.buymore.models;

import com.buymore.composite.Address;
import com.buymore.enums.Role;
import com.buymore.interfaces.CashierInterface;
import com.buymore.interfaces.CompanyInterface;
import com.buymore.interfaces.CustomerInterface;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person implements CustomerInterface {
    private String customerId;
    private Role role;
    private List<String> customerCart;

    private CashierInterface cashierInterface;
    private CompanyInterface companyInterface;

    public Customer(String customerId, String firstName, String lastName, long phoneNumber, String email, Address address) {
        super(firstName, lastName, phoneNumber, email, address);
        this.customerId = customerId;
        this.role = Role.CUSTOMER;
        this.customerCart = new ArrayList<>();
    }

    @Override
    public void buyProducts() {
        if(!customerCart.isEmpty()) {
            if (cashierInterface.sellProducts(customerCart)) {
                System.out.println(cashierInterface.presentReceipts(customerCart));
            }
        }else {
            System.out.println("Unable to process the goods or cart empty");
        }
    }

    @Override
    public void addToCart(Product product) {
        product.setQuantityInStock((product.getQuantityInStock() - 1));
        customerCart.add(product.getProductId());
    }

    @Override
    public void removeFromCart(Product product) {
        product.setQuantityInStock((product.getQuantityInStock() + 1));
        customerCart.remove(product.getProductId());
    }

    @Override
    public void getListOfProducts() {
        companyInterface.getListOfProducts();
    }

    @Override
    public void viewCart() {
        System.out.println(customerCart);
    }

    @Override
    public void setCashierInterface(CashierInterface cashierInterface) {
        this.cashierInterface = cashierInterface;
    }

    @Override
    public void setCompanyInterface(CompanyInterface companyInterface) {
        this.companyInterface = companyInterface;
    }
}
