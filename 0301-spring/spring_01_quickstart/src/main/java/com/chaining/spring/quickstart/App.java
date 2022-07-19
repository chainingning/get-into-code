package com.chaining.spring.quickstart;

import com.chaining.spring.quickstart.service.BookService;
import com.chaining.spring.quickstart.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}