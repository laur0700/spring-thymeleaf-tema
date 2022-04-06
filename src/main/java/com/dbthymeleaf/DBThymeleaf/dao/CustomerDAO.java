package com.dbthymeleaf.DBThymeleaf.dao;

import com.dbthymeleaf.DBThymeleaf.model.Customer;
import com.dbthymeleaf.DBThymeleaf.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerDAO implements DAO<Customer> {
    private final CustomerRepository customerRepository;

    @Override
    public Optional<Customer> get(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public ArrayList<Customer> getAll() {
        return (ArrayList<Customer>) customerRepository.findAll();
    }

    public ArrayList<Customer> filterByUsername(String username){
        return customerRepository.findAllByUsername(username);
    }

    public ArrayList<Customer> filterByCity(String city){
        return customerRepository.findAllByCity(city);
    }

    public ArrayList<Customer> filterByCountry(String country){
        return customerRepository.findAllByCountry(country);
    }

    @Override
    public void create(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }
}
