package com.learn.bookstoremanagement.services;

import com.learn.bookstoremanagement.model.Book;
import com.learn.bookstoremanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public Optional<Book> findByBookId(Long id){
        return bookRepository.findById(id);
    }

    public List<Book> findAllBooks()
    {
        return bookRepository.findAll();
    }

    public void deleteBookById(Long id){
        bookRepository.deleteById(id);
    }
}
