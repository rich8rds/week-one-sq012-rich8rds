package com.shop.models;

import com.shop.enums.Qualification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ApplicantServiceImplTest {
    @Test
    void applicationSuccessful() {
        Address tomAddress = new Address("Rabbi Street", "Port Harcourt", "Rivers");
        Applicant applicant3 = new Applicant("AP095", "Thompson", "Leke",
                234814098123L, "kolade.lola@gmail.com", tomAddress, Qualification.HND, 3);

        ApplicantService applicantService = new ApplicantServiceImpl();
        String result = applicantService.apply(applicant3);

        assertEquals("You have been hired as a Cashier.", result);
    }

    @Test
    void applicationUnsuccessful() {
        Address tomAddress = new Address("Rabbi Street", "Port Harcourt", "Rivers");
        Applicant applicant3 = new Applicant("AP095", "Thompson", "Leke",
                234814098123L, "kolade.lola@gmail.com", tomAddress, Qualification.MSC, 3);

        ApplicantService applicantService = new ApplicantServiceImpl();
        String result = applicantService.apply(applicant3);

        assertNotEquals("You have been hired as a Cashier.", result);
    }
}