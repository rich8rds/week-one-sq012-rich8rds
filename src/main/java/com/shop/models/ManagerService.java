package com.shop.models;

import com.shop.enums.Role;

public interface ManagerService {
    boolean hireCashier(Applicant applicant, Role role);
}
