package com.genspark.invoiceAPI.Dao;

import com.genspark.invoiceAPI.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CustomerDao extends JpaRepository<Customer, Integer> {
}
