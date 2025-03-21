package com.linus.controller;

import com.linus.records.Author;
import com.linus.records.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

  @QueryMapping
  public Book bookById(@Argument String id) {
    return Book.getById(id);
  }

  @SchemaMapping
  public Author author(Book book) {
    return Author.getById(book.authorId());
  }
}
