package com.exercises.exercise.mapper;

import com.exercises.exercise.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    int addBook(Book book);
    int deleteBookById(Integer id);
    int updateBookById(Book book);
    Book getBookById();
    List<Book> getAllBooks();
}
