package com.genspark.invoiceAPI.Service;

import com.genspark.invoiceAPI.Entity.LineItem;

import java.util.List;

public interface LineItemService {
    List<LineItem> getLineItems();
    LineItem getLineItemById(int lineItemId);
    LineItem addLineItem(LineItem lineItem);
    LineItem updateLineItem(LineItem lineItem);
    String deleteLineItem(int lineItemId);
}
