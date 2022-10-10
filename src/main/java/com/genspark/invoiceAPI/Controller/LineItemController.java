package com.genspark.invoiceAPI.Controller;

import com.genspark.invoiceAPI.Entity.LineItem;
import com.genspark.invoiceAPI.Service.LineItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class LineItemController {
    @Autowired
    LineItemService lineItemService;

    @GetMapping("/lineitems")
    public List<LineItem> getLineItems(){
        return this.lineItemService.getLineItems();
    }

    @GetMapping("/lineitems/{lineItemId}")
    public LineItem getLineItemById(@PathVariable int lineItemId){
        return this.lineItemService.getLineItemById(lineItemId);
    }

    @PostMapping("/lineitems")
    public LineItem addLineItem(@RequestBody LineItem lineItem){
        return this.lineItemService.addLineItem(lineItem);
    }

    @PutMapping("/lineitems")
    public LineItem updateLineItem(@RequestBody LineItem lineItem){
        return this.lineItemService.updateLineItem(lineItem);
    }

    @DeleteMapping("/lineitems/{lineItemId}")
    public String deleteLineItem(@PathVariable int lineItemId){
        return this.lineItemService.deleteLineItem(lineItemId);
    }
}
