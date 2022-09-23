package com.buymore.models;

import com.buymore.composite.Address;
import com.buymore.enums.Role;

public class Manager extends Staff {
    public Manager(String firstName, String lastName, long phoneNumber, String email, Role role, Address address) {
        super(firstName, lastName, phoneNumber, email, role, address);
    }

    public Manager(String staffId, String firstName, String lastName, long phoneNumber, String email, Role role, Address address) {
        super(staffId, firstName, lastName, phoneNumber, email, role, address);
    }

    public void hireCashier() {
        System.out.println("Hiring a cashier!!");
    }
//
//    public void seeListOfCustomers() {
//
//    }
//
//    public void seeListOfTransactions() {
//
//    }
}
