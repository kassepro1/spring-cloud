package sn.kp.billingservice.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.kp.billingservice.domaine.Bill;
import sn.kp.billingservice.service.BillingService;

@RestController
@RequiredArgsConstructor
public class BillingController {

    private final BillingService billingService;
    @PostMapping("/bills/{customerId}")
    public Bill saveBilling(@PathVariable(name = "customerId") Long customerId){
        return billingService.save(customerId);
    }
}
