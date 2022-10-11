package com.genspark.invoiceAPI.Service;

import com.genspark.invoiceAPI.Entity.Billable;

import java.util.List;

public interface BillableService {
    List<Billable> getBillables();
    Billable getBillableById(int billableId);
    Billable addBillable(Billable billable);
    Billable updateBillable(Billable billable);
    String deleteBillable(int billableId);
}
