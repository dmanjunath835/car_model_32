package demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
