package com.genspark.invoiceAPI.Service;

import com.genspark.invoiceAPI.Dao.BillableDao;
import com.genspark.invoiceAPI.Entity.Billable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillableServiceImpl implements BillableService {
    @Autowired
    BillableDao billableDao;

    @Override
    public List<Billable> getBillables() {
        return this.billableDao.findAll();
    }

    @Override
    public Billable getBillableById(int billableId) {
        return this.billableDao.findById(billableId).orElseThrow();
    }

    @Override
    public Billable addBillable(Billable billable) {
        return this.billableDao.save(billable);
    }

    @Override
    public Billable updateBillable(Billable billable) {
        return this.billableDao.save(billable);
    }

    @Override
    public String deleteBillable(int billableId) {
        this.billableDao.deleteById(billableId);
        return "Deleted Successfully";
    }
}
