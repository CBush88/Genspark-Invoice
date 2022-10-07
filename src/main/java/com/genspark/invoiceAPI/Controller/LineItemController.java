package com.genspark.invoiceAPI.Controller;

import com.genspark.invoiceAPI.Entity.LineItem;
import com.genspark.invoiceAPI.Service.LineItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LineItemController {
    @Autowired
    LineItemService lineItemService;

    @GetMapping("/lineitems")
    public List<LineItem> getLineItems(){
        return this.lineItemService.getLineItems();
    }
}
