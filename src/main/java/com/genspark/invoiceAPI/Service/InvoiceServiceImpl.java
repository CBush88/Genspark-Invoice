package com.genspark.invoiceAPI.Service;

import com.genspark.invoiceAPI.Dao.InvoiceDao;
import com.genspark.invoiceAPI.Entity.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    InvoiceDao invoiceDao;

    @Override
    public List<Invoice> getInvoices() {
        return this.invoiceDao.findAll();
    }

    @Override
    public List<Invoice> getInvoicesByCustomerId(int customerId) {
        return this.invoiceDao.findByCustomerId(customerId);
    }

    @Override
    public Invoice getInvoiceById(int invoiceId) {
        return this.invoiceDao.findById(invoiceId).orElseThrow();
    }

    @Override
    public Invoice addInvoice(Invoice invoice) {
        return this.invoiceDao.save(invoice);
    }

    @Override
    public Invoice updateInvoice(Invoice invoice) {
        return this.invoiceDao.save(invoice);
    }

    @Override
    public String deleteInvoice(int invoiceId) {
        return "Deleted Successfully";
    }
}
