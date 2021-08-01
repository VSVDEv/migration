package com.vsvdev.init.web;

import com.vsvdev.init.model.Book;
import com.vsvdev.init.repo.BookRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("books")
@RequiredArgsConstructor
public class BookController {

  private final BookRepository bookRepository;

  @GetMapping
  public List<Book> findAll() {
    return bookRepository.findAll();
  }

  @GetMapping("{id}")
  public ResponseEntity<Book> findById(@PathVariable int id) {
    return bookRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
  }

  @PostMapping
  public Book save(@RequestBody Book book) {
    return bookRepository.save(book);
  }
}
