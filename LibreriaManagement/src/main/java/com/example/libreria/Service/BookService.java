package com.example.libreria.Service;

import com.example.libreria.Entity.Book;
import com.example.libreria.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookrepository;

    public List<Book> getBooks(){
        return bookrepository.findAll();
    }
    public Optional<Book> getBook(Long id){
        return bookrepository.findById(id);
    }

    public void SaveOrUpdateBooks(Book book){
        bookrepository.save(book);
    }
    public void DeleteBooks(Long id){
        bookrepository.deleteById(id);
    }
}
