package sn.kp.inventoryservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.kp.inventoryservice.domaine.Product;


@RepositoryRestResource
public interface ProductRepositories extends JpaRepository<Product,Long> {
}
