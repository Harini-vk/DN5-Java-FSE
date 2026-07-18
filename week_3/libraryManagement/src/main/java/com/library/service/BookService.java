package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.stereotype.Service;

import com.library.entity.Book;
import com.library.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    public Book getbyId(Integer id) {
    	return bookRepository.findById(id).orElse(null);	
    }
    public void DeleteById(Integer id) {
    	bookRepository.deleteById(id);
    }
    
    public Book updateBook(Integer id, Book updatedBook) {
    	Book existing = bookRepository.findById(id).orElse(null);
    	if (existing != null) {
    		existing.setTitle(updatedBook.getTitle());
    		existing.setAuthor(updatedBook.getAuthor());
    		return bookRepository.save(existing);
    	}
    	return null;
    }
    
    
}