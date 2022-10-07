package com.genspark.invoiceAPI.Service;

import com.genspark.invoiceAPI.Entity.Invoice;

import java.util.List;

public interface InvoiceService {
    List<Invoice> getInvoices();
    List<Invoice> getInvoicesByCustomerId(int customerId);
    Invoice getInvoiceById(int invoiceId);
    Invoice addInvoice(Invoice invoice);
    Invoice updateInvoice(Invoice invoice);
    String deleteInvoice(int invoiceId);
}
