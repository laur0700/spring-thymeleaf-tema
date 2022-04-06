package com.dbthymeleaf.DBThymeleaf.repository;

import com.dbthymeleaf.DBThymeleaf.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    ArrayList<Customer> findAllByUsername(String username);
    ArrayList<Customer> findAllByCity(String city);
    ArrayList<Customer> findAllByCountry(String country);
}
