package com.rdemir.library.controller;

import com.rdemir.library.model.Book;
import com.rdemir.library.model.Response;
import com.rdemir.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ramazan on 18.04.2017.
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private Response response;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Response list() {
        List bookList = bookService.findAll();
        response = new Response("200", "Success", bookList);
        return response;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Response create(@RequestBody Book book) {
        Book book1 = bookService.save(book);
        response = new Response("200", "Success", book1);

        return response;
    }
}
