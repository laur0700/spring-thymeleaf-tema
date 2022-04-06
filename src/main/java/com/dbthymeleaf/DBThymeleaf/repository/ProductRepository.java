package com.dbthymeleaf.DBThymeleaf.repository;

import com.dbthymeleaf.DBThymeleaf.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
