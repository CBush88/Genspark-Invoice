package com.genspark.invoiceAPI.Entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

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

    private float totalPrice;
}
