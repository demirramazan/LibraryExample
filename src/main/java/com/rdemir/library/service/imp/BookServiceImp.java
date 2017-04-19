package com.rdemir.library.service.imp;

import com.rdemir.library.model.Book;
import com.rdemir.library.repository.BookRepository;
import com.rdemir.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ramazan on 18.04.2017.
 */
public class BookServiceImp implements BookService {
    @Autowired
    BookRepository bookRepository;


    @Override
    public Book save(Book entity) {
        return bookRepository.save(entity);
    }

    @Override
    public Book update(Book entity) {
        return bookRepository.save(entity);
    }

    @Override
    public void delete(Book entity) {
        bookRepository.delete(entity);
    }

    @Override
    public List findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findOne(int id) {
        return bookRepository.findOne(id);
    }
}
