package com.genspark.invoiceAPI.Controller;

import com.genspark.invoiceAPI.Entity.Billable;
import com.genspark.invoiceAPI.Service.BillableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class BillableController {
    @Autowired
    BillableService billableService;

    @GetMapping("/billables")
    public List<Billable> getBillables() {
        return this.billableService.getBillables();
    }

    @GetMapping("/billables/{billableId}")
    public Billable getBillableById(@PathVariable int billableId){
        return this.billableService.getBillableById(billableId);
    }

    @PostMapping("/billables")
    public Billable addBillable(@RequestBody Billable billable){
        return this.billableService.addBillable(billable);
    }

    @PutMapping("/billables")
    public Billable updateBillable(@RequestBody Billable billable){
        return this.billableService.updateBillable(billable);
    }

    @DeleteMapping("/billables/{billableId}")
    public String deleteBillable(@PathVariable int billableId){
        return this.billableService.deleteBillable(billableId);
    }
}