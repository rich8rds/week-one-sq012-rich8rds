package com.shop.models;


import com.shop.enums.Qualification;
import com.shop.models.Address;
import com.shop.models.Person;

public class Applicant extends Person {
    private String id;
    private Qualification qualification;
    private Integer yearsOfExperience;

    public Applicant(String id, String firstName, String lastName, long phoneNumber,
                     String email, Address address, Qualification qualification, Integer yearsOfExperience) {
        super(firstName, lastName, phoneNumber, email, address);
        this.id = id;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
