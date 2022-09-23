package com.buymore.models;

import com.buymore.composite.Address;
import com.buymore.enums.Role;
import com.buymore.interfaces.ManagerInterface;

import java.util.List;

public class Manager extends Staff implements ManagerInterface {
    public Manager(String staffId, String firstName, String lastName, long phoneNumber, String email, Role role, Address address) {
        super(staffId, firstName, lastName, phoneNumber, email, role, address);
    }

    @Override
    public List<Staff> getStaffList() {
        return null;
    }

    @Override
    public boolean hireCashier(String id) {
        return false;
    }
}
