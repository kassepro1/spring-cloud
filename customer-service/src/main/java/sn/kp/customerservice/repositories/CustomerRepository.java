package sn.kp.customerservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.kp.customerservice.domaine.Customer;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
