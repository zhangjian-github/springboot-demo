package com.example.springbootdemo.dao;

public interface BaseDAO<T> {

    boolean insert(T t);

    T getById(Long id);

}
