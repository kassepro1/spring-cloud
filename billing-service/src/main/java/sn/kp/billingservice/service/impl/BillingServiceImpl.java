package sn.kp.billingservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.kp.billingservice.domaine.Bill;
import sn.kp.billingservice.domaine.Customer;
import sn.kp.billingservice.repositories.BillRepository;
import sn.kp.billingservice.service.BillingService;
import sn.kp.billingservice.service.CustomerService;
import sn.kp.billingservice.service.InventoryService;

import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BillingServiceImpl implements BillingService {

    private final BillRepository billRepository;
    private final CustomerService customerService;

    @Override
    public Bill save(Long customerId) {
        Bill bill = null;
        Customer customer = customerService.findCustomerById(customerId);
        if(Objects.nonNull(customer)){
            bill = new Bill();
            bill.setCustomerId(customer.getId());
            bill = billRepository.save(bill);
        }
        return bill;
    }

    @Override
    public Bill findBillBbyId(Long id) {
        Optional<Bill> b = null;
        b = billRepository.findById(id);
        if(b.isPresent()){
            return b.get();
        }else {
            throw new RuntimeException();
        }

    }
}
