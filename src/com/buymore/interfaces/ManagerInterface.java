package com.buymore.interfaces;

import com.buymore.models.Customer;
import com.buymore.models.Product;
import com.buymore.models.Staff;

import java.util.List;

public interface ManagerInterface {
    List<Staff> getStaffList();
    boolean hireCashier(String id);
}
