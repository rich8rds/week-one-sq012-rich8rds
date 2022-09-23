package com.buymore.models;

import com.buymore.composite.Address;
import com.buymore.enums.Role;
import com.buymore.interfaces.CompanyInterface;
import com.buymore.interfaces.StaffInterface;

import java.util.List;

public abstract class Staff extends Person implements StaffInterface {
    private String staffId;
    private Role role;
    CompanyInterface buyMoreInterface;

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

    public void setBuyMoreInterface(CompanyInterface buyMoreInterface) {
        this.buyMoreInterface = buyMoreInterface;
    }

    @Override
    public List<Product> getProductList() {
        return null;
    }

    @Override
    public List<Customer> getCustomerList() {
        return null;
    }
}
