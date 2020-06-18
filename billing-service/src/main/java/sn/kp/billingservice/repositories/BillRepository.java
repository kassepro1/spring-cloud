package sn.kp.billingservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.kp.billingservice.domaine.Bill;

@RepositoryRestResource
public interface BillRepository  extends JpaRepository<Bill,Long> {
}
