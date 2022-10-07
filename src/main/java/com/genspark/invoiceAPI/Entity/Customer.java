package com.genspark.invoiceAPI.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @SequenceGenerator(name = "customer_seq", sequenceName = "customer_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    @OneToMany(
            mappedBy = "customer"
    )
    private List<Invoice> invoices;

    public Customer() {
    }

    public Customer(int customerId, String firstName, String lastName, String email, String phone, List<Invoice> invoices) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.invoices = invoices;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", invoices=" + invoices +
                '}';
    }
}
