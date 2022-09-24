package com.buymore.models;

import com.buymore.composite.Address;
import com.buymore.enums.Role;
import com.buymore.interfaces.CashierInterface;
import com.buymore.interfaces.CompanyInterface;
import com.buymore.interfaces.CustomerInterface;
import com.buymore.interfaces.ManagerInterface;

import java.time.LocalDate;
import java.util.List;

public class Staff extends Person implements ManagerInterface, CashierInterface {
    private String staffId;
    private Role role;
    CompanyInterface companyInterface;

    CustomerInterface customerInterface;

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

    public void setBuyMoreInterface(CompanyInterface companyInterface) {
        this.companyInterface = companyInterface;
    }

    public void setCustomerInterface(CustomerInterface customerInterface) {
       this.customerInterface = customerInterface;
    }


    // CASHIER INTERFACE
    @Override
    public boolean sellProducts(List<Product> product) {
       return !product.isEmpty();
    }

    @Override
    public String presentReceipts(List<Product> customerCart) {
        int count = 0;
        double total = 0;
        System.out.println("\n\n*******************************************************************");
        System.out.println("BUY MORE RECEIPT");
        System.out.println(LocalDate.now());
        System.out.println("*******************************************************************");
        System.out.println("SN\t\tPRODUCT ID\t\tPRODUCT\t\tPRICE\t\tQUANTITY");
        System.out.println("*******************************************************************\n");
        for(Product p : customerCart) {
            System.out.print(++count + ": \t\t"+p.getProductId() +
                    "\t\t\t" + p.getProductName() +
                    "\t\t" + p.getPrice() +
                    "\t\t" + p.getQuantityInStock() + "\n");
            total += p.getPrice();
        }
        System.out.println("\n*******************************************************************");
        System.out.println("TOTAL: " + total);
        System.out.println("\n*******************************************************************");
        System.out.println();
        return "Thank you for shopping with us!";
    }

    @Override
    public List<Product> getProductList() {
        return null;
    }

    @Override
    public List<Customer> getCustomerList() {
        return null;
    }

    @Override
    public void showProductsInStock() {
        companyInterface.getListOfProducts();
    }


    //MANAGER INTERFACE
    @Override
    public List<Staff> getStaffList() {
        return null;
    }

    @Override
    public boolean hireCashier(String id) {
        return false;
    }


}
