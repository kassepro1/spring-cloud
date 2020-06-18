package sn.kp.billingservice.service;

import sn.kp.billingservice.domaine.Bill;

public interface BillingService {

    public Bill save(Long customerId);
    public Bill findBillBbyId(Long id);
}
