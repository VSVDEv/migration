package com.vsvdev.init.repo;

import com.vsvdev.init.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
