package com.genspark.invoiceAPI.Service;

import com.genspark.invoiceAPI.Dao.CustomerDao;
import com.genspark.invoiceAPI.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDao customerDao;

    @Override
    public List<Customer> getCustomers() {
        return this.customerDao.findAll();
    }

    @Override
    public Customer getCustomerById(int customerId) {
        return this.customerDao.findById(customerId).orElseThrow();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return this.customerDao.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return this.customerDao.save(customer);
    }

    @Override
    public String deleteCustomer(int customerId) {
        return "Deleted Successfully";
    }
}
