package com.dbthymeleaf.DBThymeleaf.dao;


import java.util.ArrayList;
import java.util.Optional;

public interface DAO <T>{
    Optional<T> get(Integer id);
    ArrayList<T> getAll();
    void create(T t);
    void update(T t);
    void delete(T t);
}
