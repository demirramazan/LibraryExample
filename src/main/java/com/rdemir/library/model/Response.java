package com.rdemir.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ramazan on 18.04.2017.
 */
@Data
@AllArgsConstructor
public class Response {
    private String code;
    private String message;
    private List data;

    public Response(String code, String message, Book entity) {
        this.code = code;
        this.message = message;
        data = Arrays.asList(entity);
    }
}
