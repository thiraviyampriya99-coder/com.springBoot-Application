package com.springBootCrud.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springBootCrud.model.Books;
import com.springBootCrud.repository.*;

@Service
public class BooksService {
	@Autowired
	private BooksRepository booksrepository;

	public List<Books> getAllBooks() {
	List<Books> books  = new ArrayList<>();
	return books;

	}

	public Books getBooksById(int id) {
	return booksrepository .findById(id).orElse(null);


	}

	public void saveOrUpdate(Books books) {
	booksrepository .save(books);
	}
	public void delete(int id) {
	booksrepository .deleteById(id);
	}

	}




	

