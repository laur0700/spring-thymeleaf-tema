package com.dbthymeleaf.DBThymeleaf.repository;

import com.dbthymeleaf.DBThymeleaf.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
