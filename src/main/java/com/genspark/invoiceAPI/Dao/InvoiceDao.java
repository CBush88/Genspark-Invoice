package com.genspark.invoiceAPI.Dao;

import com.genspark.invoiceAPI.Entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceDao extends JpaRepository<Invoice, Integer> {
    List<Invoice> findByCustomerId(int customerId);
}
