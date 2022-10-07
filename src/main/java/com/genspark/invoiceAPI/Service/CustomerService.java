package com.genspark.invoiceAPI.Service;

import com.genspark.invoiceAPI.Entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();
    Customer getCustomerById(int customerId);
    Customer addCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    String deleteCustomer(int customerId);
}
