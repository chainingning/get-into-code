package com.chaining.spring.di.autoware.service.impl;

import com.chaining.spring.di.autoware.dao.BookDao;
import com.chaining.spring.di.autoware.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}