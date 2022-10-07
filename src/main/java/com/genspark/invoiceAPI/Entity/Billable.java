package com.genspark.invoiceAPI.Entity;

import javax.persistence.*;

@Entity
public class Billable {
    @Id
    @SequenceGenerator(name = "billable_seq", sequenceName = "billable_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "billable_seq")
    private int billableId;

    private String billableName;
    private String billableDescription;
    private double billablePrice;

    public Billable() {
    }

    public Billable(int billableId, String billableName, String billableDescription, double billablePrice) {
        this.billableId = billableId;
        this.billableName = billableName;
        this.billableDescription = billableDescription;
        this.billablePrice = billablePrice;
    }

    @Override
    public String toString() {
        return "Billable{" +
                "billableId=" + billableId +
                ", billableName='" + billableName + '\'' +
                ", billableDescription='" + billableDescription + '\'' +
                ", billablePrice=" + billablePrice +
                '}';
    }
}
