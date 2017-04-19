package com.rdemir.library.service;

import com.rdemir.library.model.Book;

import java.util.List;

/**
 * Created by ramazan on 18.04.2017.
 */
public interface BookService {
    public Book save(Book entity);
    public Book update(Book entity);
    public void delete(Book entity);
    public List findAll();
    public Book findOne(int id);
}
