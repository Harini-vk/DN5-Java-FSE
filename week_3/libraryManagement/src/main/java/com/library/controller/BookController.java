package com.library.controller;
//added RESTController to test jpa coding

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.library.entity.Book;
import com.library.service.BookService;
import java.util.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }
    @GetMapping
    public List<Book> getAllBooks(){
    	return bookService.getAllBooks();
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id) {
    	return bookService.getbyId(id);
    }
    @DeleteMapping("/{id}")
    public String DeleteById(@PathVariable Integer id) {
    	bookService.DeleteById(id);
    	return "Book deleted successfully!";
    }
    
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Integer id, @RequestBody Book book) {
    	return bookService.updateBook(id, book);
    }
}