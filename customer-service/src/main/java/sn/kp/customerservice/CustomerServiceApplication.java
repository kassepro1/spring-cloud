package sn.kp.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import sn.kp.customerservice.domaine.Customer;
import sn.kp.customerservice.repositories.CustomerRepository;

@SpringBootApplication
public class CustomerServiceApplication  {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(CustomerRepository  customerRepository , RepositoryRestConfiguration repositoryRestConfiguration) throws Exception {
        return args -> {
            repositoryRestConfiguration.exposeIdsFor(Customer.class);
             customerRepository.save(new Customer(null,"AMA Andre","andrea@gmail.com"));
             customerRepository.save(new Customer(null,"BOYER Matild","boyermatil@gmail.com"));
             customerRepository.save(new Customer(null,"DESIGNE Simon","paul@gmail.com"));
             customerRepository.save(new Customer(null,"DUPONT Chritophe","dupont@gmail.com"));
             customerRepository.findAll().forEach(System.out::println);
        };
    }
}
