package com.demonorium;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer getById(Long id);

    List<Customer> findByLastName(String bauer);
}
