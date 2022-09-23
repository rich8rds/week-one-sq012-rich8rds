package com.buymore.models;

import com.buymore.composite.Address;
import com.buymore.enums.Role;
import com.buymore.interfaces.CashierInterface;
import com.buymore.interfaces.CompanyInterface;
import com.buymore.interfaces.CustomerInterface;

import java.util.List;

public class Cashier extends Staff implements CashierInterface {
    CompanyInterface companyInterface;
    CustomerInterface customerInterface;
    public Cashier(String staffId, String firstName, String lastName, long phoneNumber, String email, Role role, Address address) {
        super(staffId, firstName, lastName, phoneNumber, email, role, address);
    }

    @Override
    public boolean sellProducts(List<String> productIds) {
        return !productIds.isEmpty();
    }

    @Override
    public String presentReceipts(List<String> customerCart) {

        return null;
    }

    @Override
    public void setCompanyInterface(CompanyInterface companyInterface) {
        this.companyInterface = companyInterface;
    }

    @Override
    public void setCustomerInterface(CustomerInterface customerInterface) {
        this.customerInterface = customerInterface;
    }
}
