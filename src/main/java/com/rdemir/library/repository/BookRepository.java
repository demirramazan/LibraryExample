package com.rdemir.library.repository;

import com.rdemir.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ramazan on 18.04.2017.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
