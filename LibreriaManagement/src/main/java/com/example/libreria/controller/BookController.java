package com.example.libreria.controller;

import com.example.libreria.Entity.Book;
import com.example.libreria.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAll(){
        return bookService.getBooks();
    }

    @GetMapping("/{BookId}")
    public Optional<Book> getById(@PathVariable("BookId") Long bookId){
        return bookService.getBook(bookId);
    }

    @PostMapping
    public Book saveUpdate(@RequestBody Book book){
        bookService.SaveOrUpdateBooks(book);
        return book;
    }

    @DeleteMapping("/{BookId}")
    public void saveUpdate(@PathVariable("BookId") Long bookId){
        bookService.DeleteBooks(bookId);
    }


}
