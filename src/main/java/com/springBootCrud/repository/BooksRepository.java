package com.springBootCrud.repository;
import java.awt.print.Book;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import com.springBootCrud.model.Books;
public interface BooksRepository extends CrudRepository < Books , Integer>{
}
