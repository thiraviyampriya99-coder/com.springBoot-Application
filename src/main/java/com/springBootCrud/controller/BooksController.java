package com.springBootCrud.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootCrud.model.Books;
import com.springBootCrud.service.BooksService;

@RestController
@RequestMapping("/books")

public class BooksController {

@Autowired
private BooksService bookService;

@GetMapping("/")
public String home() {
return "Welcome to Books API";

}

@GetMapping("/test")
public String test() {
return "It Works!";
}

@GetMapping
public List<Books> getAllBooks(){
return bookService.getAllBooks();
}

@GetMapping("{bookid})")
public Books getBook(@PathVariable("bookid") int bookid) {
return bookService.getBooksById(bookid);

}

@DeleteMapping("/{bookid}")
public void deletebook(@PathVariable("bookid") int bookid) {
bookService.delete(bookid);
}

@PostMapping
public int saveBook(@RequestBody Books books) {
bookService.saveOrUpdate(books);
return books.getBookid();
}

@PutMapping
public Books update(@RequestBody Books books) {
bookService.saveOrUpdate(books);
return books;
}

}
