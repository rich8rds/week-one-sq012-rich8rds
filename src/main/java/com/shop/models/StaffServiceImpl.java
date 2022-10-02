package com.shop.models;

import com.shop.enums.Qualification;
import com.shop.enums.Role;

import java.time.LocalDate;
import java.util.List;

public class StaffServiceImpl implements ManagerService, CashierService {

    // CASHIER SERVICE
    @Override
    public String sellProducts(Customer customer, List<Product> cartItems) {
        double totalPrice = 0d;
        for(Product p : cartItems) {
            totalPrice += p.getPrice() * p.getQuantityInStock();
        }
        if((totalPrice < customer.getBalance())) {
            issueReceipt(customer, cartItems);
            return "Cleared";
        }
        return "Insufficient Funds!";
    }

    @Override
    public void issueReceipt(Customer customer, List<Product> cartItems) {
        int count = 0;
        double total = 0;
        System.out.println("\n\n*******************************************************************");
        System.out.println("BUY MORE RECEIPT");
        System.out.println(customer.toString());
        System.out.println(LocalDate.now());
        System.out.println("*******************************************************************");
        System.out.println("SN\t\tPRODUCT ID\t\tPRODUCT\t\tPRICE\t\tQUANTITY");
        System.out.println("*******************************************************************\n");

        for(Product p : cartItems) {
            System.out.println((++count) +""+ p);
            total += p.getPrice() * p.getQuantityInStock();
        }
        System.out.println("\n*******************************************************************");
        System.out.println("TOTAL: " + total);
        System.out.println("\n*******************************************************************");
        System.out.println();
    }


    //MANAGER SERVICE
    @Override
    public boolean hireCashier(Applicant applicant) {
        if(applicant.getQualification().equals(Qualification.HND)
                && applicant.getYearsOfExperience() >= 2){
            CompanyDB companyDB = new CompanyDB();
            companyDB.getStaff().add(
                    new Staff("STAF753", applicant.getFirstName(),
                            applicant.getLastName(),
                            applicant.getPhoneNumber(), applicant.getEmail(),
                             Role.CASHIER,
                            applicant.getAddress()));
            return true;
        }
        return false;
    }
}
