package com.exercises.exercise.controller;

import com.exercises.exercise.model.Book;
import com.exercises.exercise.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping("/bookOps")
    public void bookOps(){
        Book b1 = new Book();
        b1.setName("西厢记");
        b1.setAuthor("王世普");
        int i = bookService.addBook(b1);
        System.out.println("addBook>>>"+i);
        Book b2 = new Book();
        b2.setName("朝花夕拾");
        b2.setAuthor("鲁迅");
        b2.setId(1);
        int updateBook = bookService.updateBook(b2);
        System.out.println("update>>>"+b2);
    }
}
