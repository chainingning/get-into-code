package com.chaining.ssm.quickstart;

import com.chaining.ssm.quickstart.service.BookService;
import com.chaining.ssm.quickstart.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}