package com.buymore.interfaces;


import java.util.List;

public interface CashierInterface {
    boolean sellProducts(List<String> productIds);
    String presentReceipts(List<String> customerCart);
    void setCompanyInterface(CompanyInterface companyInterface);
    void setCustomerInterface(CustomerInterface customerInterface);
}
