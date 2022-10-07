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
            name = "invoice_id",
            referencedColumnName = "invoiceId"
    )
    private Invoice invoice;

    @ManyToOne
    @JoinColumn(
            name = "billable_id",
            referencedColumnName = "billableId"
    )
    private Billable billable;

    private int Quantity;

    public LineItem() {
    }

    public LineItem(int lineId, Invoice invoice, Billable billable, int quantity) {
        this.lineId = lineId;
        this.invoice = invoice;
        this.billable = billable;
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "lineId=" + lineId +
                ", invoice=" + invoice +
                ", billable=" + billable +
                ", Quantity=" + Quantity +
                '}';
    }
}
