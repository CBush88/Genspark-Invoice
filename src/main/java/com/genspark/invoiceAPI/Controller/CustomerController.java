package com.genspark.invoiceAPI.Controller;

import com.genspark.invoiceAPI.Entity.Customer;
import com.genspark.invoiceAPI.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
        public List<Customer> getCustomers(){
        return this.customerService.getCustomers();
    }
}
