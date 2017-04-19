package com.rdemir.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * Created by ramazan on 18.04.2017.
 */
@Data
@Entity
@Table(name = "BOOK")
public class Book {
    private String name;

    @Lob
    private String summary;
}
