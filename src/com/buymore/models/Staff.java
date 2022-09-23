package com.buymore.models;

import com.buymore.composite.Address;
import com.buymore.enums.Role;

public class Staff extends Person{
    private String staffId;
    private Role role;

    public Staff(String firstName, String lastName, long phoneNumber, String email, Role role, Address address) {
        super(firstName, lastName, phoneNumber, email, address);
    }

       public Staff(String staffId, String firstName, String lastName, long phoneNumber, String email, Role role, Address address) {
        super(firstName, lastName, phoneNumber, email, address);
        this.staffId = staffId;
        this.role = role;
    }

    public String getStaffId() {
        return staffId;
    }

    public Role getRole() {
        return role;
    }
}
