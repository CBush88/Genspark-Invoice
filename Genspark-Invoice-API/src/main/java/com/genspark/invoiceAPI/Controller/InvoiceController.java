package com.genspark.invoiceAPI.Controller;

import com.genspark.invoiceAPI.Entity.Invoice;
import com.genspark.invoiceAPI.Service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/invoices/{invoiceId}")
    public Invoice getInvoiceById(@PathVariable int invoiceId){
        return this.invoiceService.getInvoiceById(invoiceId);
    }

    @PostMapping("/invoices")
    public Invoice addInvoice(@RequestBody Invoice invoice){
        return this.invoiceService.addInvoice(invoice);
    }

    @PutMapping("/invoices")
    public Invoice updateInvoice(@RequestBody Invoice invoice){
        return this.invoiceService.updateInvoice(invoice);
    }

    @DeleteMapping("/invoices/{invoiceId}")
    public String deleteInvoice(@PathVariable int invoiceId){
        return this.invoiceService.deleteInvoice(invoiceId);
    }
}
