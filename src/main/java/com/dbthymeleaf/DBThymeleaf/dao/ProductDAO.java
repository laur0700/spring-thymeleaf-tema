package com.dbthymeleaf.DBThymeleaf.dao;

import com.dbthymeleaf.DBThymeleaf.model.Product;
import com.dbthymeleaf.DBThymeleaf.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Optional;

@RequiredArgsConstructor
public class ProductDAO implements DAO<Product> {
    private final ProductRepository productRepository;

    @Override
    public Optional<Product> get(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public ArrayList<Product> getAll() {
        return null;
    }

    @Override
    public void create(Product product) {
        productRepository.save(product);
    }

    @Override
    public void update(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }
}
