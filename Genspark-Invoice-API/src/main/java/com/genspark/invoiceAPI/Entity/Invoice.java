package com.genspark.invoiceAPI.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Invoice {
    @Id
    @SequenceGenerator(name = "invoice_seq", sequenceName = "invoice_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "invoice_seq")
    private int invoiceId;

    @ManyToOne
    @JoinColumn(
            name = "customer_id",
            referencedColumnName = "customerId"
    )
    private Customer customer;

    private String status;

    @OneToMany
    @JoinColumn(
            name = "invoice_id",
            referencedColumnName = "invoiceId"
    )
    private List<LineItem> lineItems;
    
    private double totalPrice;

    public Invoice() {
    }

    public Invoice(int invoiceId, Customer customer, String status, List<LineItem> lineItems, double totalPrice) {
        this.invoiceId = invoiceId;
        this.customer = customer;
        this.status = status;
        this.lineItems = lineItems;
        this.totalPrice = calculateTotalPrice();
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = calculateTotalPrice();
    }

    public double calculateTotalPrice(){
        return lineItems.stream()
                .mapToDouble(item -> item.getBillable().getBillablePrice() * item.getQuantity())
                .reduce(Double::sum).orElseThrow();
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", customer=" + customer +
                ", status='" + status + '\'' +
                ", lineItems=" + lineItems +
                ", totalPrice=" + totalPrice +
                '}';
    }
}