package sn.kp.customerservice.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import sn.kp.customerservice.domaine.Customer;

@Projection(
        name = "customerProjection",
        types = { Customer.class })
public interface CustomerProjection {
     @Value("#{target.id}")
     Long getId();
     String getName();


}
