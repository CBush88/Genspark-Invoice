package com.genspark.invoiceAPI.Entity;

import javax.persistence.*;

@Entity
public class LineItem {
    @Id
    @SequenceGenerator(name = "line_seq", sequenceName = "line_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "line_seq")
    private int lineId;

    @ManyToOne
    @JoinColumn(
            name = "billable_id",
            referencedColumnName = "billableId"
    )
    private Billable billable;

    private int quantity;

    public LineItem() {
    }

    public LineItem(int lineId, Billable billable, int quantity) {
        this.lineId = lineId;
        this.billable = billable;
        this.quantity = quantity;
    }

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public Billable getBillable() {
        return billable;
    }

    public void setBillable(Billable billable) {
        this.billable = billable;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "lineId=" + lineId +
                ", billable=" + billable +
                ", quantity=" + quantity +
                '}';
    }
}
