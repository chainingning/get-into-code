package com.chaining.spring.lifecycle.service.impl;

import com.chaining.spring.lifecycle.dao.BookDao;
import com.chaining.spring.lifecycle.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}