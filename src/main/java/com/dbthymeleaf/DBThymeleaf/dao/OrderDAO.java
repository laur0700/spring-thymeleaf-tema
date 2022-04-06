package com.dbthymeleaf.DBThymeleaf.dao;

import com.dbthymeleaf.DBThymeleaf.model.Order;
import com.dbthymeleaf.DBThymeleaf.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderDAO implements DAO<Order> {
    private final OrderRepository orderRepository;

    @Override
    public Optional<Order> get(Integer id) {
        return orderRepository.findById(id);
    }

    @Override
    public ArrayList<Order> getAll() {
        return (ArrayList<Order>) orderRepository.findAll();
    }

    @Override
    public void create(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void update(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void delete(Order order) {
        orderRepository.delete(order);
    }
}
