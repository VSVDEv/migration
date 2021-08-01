package com.vsvdev.init;

import com.vsvdev.init.model.Book;
import com.vsvdev.init.repo.BookRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class InitApplication {

  public static void main(String[] args) {
    SpringApplication.run(InitApplication.class, args);
  }


  @Component
  @RequiredArgsConstructor
  public class AppInitializer implements ApplicationRunner {

    private final BookRepository bookRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
      Book book = new Book();
      book.setTitle("Micronaut vs Spring Boot");
      book.setYear(2021);
      bookRepository.save(book);
    }
  }

}
