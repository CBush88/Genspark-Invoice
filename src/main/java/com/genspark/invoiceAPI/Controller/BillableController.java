package com.genspark.invoiceAPI.Controller;

import com.genspark.invoiceAPI.Entity.Billable;
import com.genspark.invoiceAPI.Service.BillableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillableController {
    @Autowired
    BillableService billableService;

    @GetMapping("/billables")
    public List<Billable> getBillables(){
        return this.billableService.getBillables();
    }
}
