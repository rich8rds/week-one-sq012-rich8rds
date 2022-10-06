package com.shop.models;

import com.shop.enums.Role;

public class ApplicantServiceImpl implements ApplicantService {

    StaffServiceImpl staffService = new StaffServiceImpl();

    @Override
    public String apply(Applicant applicant) {
        return staffService.hireCashier(applicant, Role.CASHIER) ?
                "You have been hired as a Cashier." :
                "Sorry to inform you that you did not meet the criteria for the job.";

    }
}
