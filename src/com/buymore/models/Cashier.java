package com.buymore.models;

import com.buymore.composite.Address;
import com.buymore.enums.Role;

public class Cashier extends Staff {

    public Cashier(String firstName, String lastName, long phoneNumber, String email, Role role, Address address) {
        super(firstName, lastName, phoneNumber, email, role, address);
    }

    public Cashier(String staffId, String firstName, String lastName, long phoneNumber, String email, Role role, Address address) {
        super(staffId, firstName, lastName, phoneNumber, email, role, address);
    }

    public void sellProduct() {
        System.out.println("Ava Soap #250 Laide Smith");
    }

    public void dispenseReceipt() {
        System.out.println("Receipt: ");
    }
}
