package com.genspark.invoiceAPI.Service;

import com.genspark.invoiceAPI.Dao.LineItemDao;
import com.genspark.invoiceAPI.Entity.LineItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineItemServiceImpl implements LineItemService {
    @Autowired
    LineItemDao lineItemDao;

    @Override
    public List<LineItem> getLineItems() {
        return this.lineItemDao.findAll();
    }

    @Override
    public LineItem getLineItemById(int lineItemId) {
        return this.lineItemDao.findById(lineItemId).orElseThrow();
    }

    @Override
    public LineItem addLineItem(LineItem lineItem) {
        return this.lineItemDao.save(lineItem);
    }

    @Override
    public LineItem updateLineItem(LineItem lineItem) {
        return this.lineItemDao.save(lineItem);
    }

    @Override
    public String deleteLineItem(int lineItemId) {
        this.lineItemDao.deleteById(lineItemId);
        return "Deleted Successfully";
    }
}
