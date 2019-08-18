package com.exercises.exercise.controller;

import com.exercises.exercise.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class BookController {
//    @Autowired
//    Book book;
    @GetMapping("/book")
    public Book book(){
        Book book = new Book("三国", "罗贯中",123.0, new Date());
        return book;
    }
}
