package com.genspark.invoiceAPI.Controller;

import com.genspark.invoiceAPI.Entity.Invoice;
import com.genspark.invoiceAPI.Service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @GetMapping("/invoices")
    public List<Invoice> getInvoices(){
        return this.invoiceService.getInvoices();
    }
}
