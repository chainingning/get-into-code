package com.chaining.spring.di.constructor.service.impl;
import com.chaining.spring.di.constructor.dao.BookDao;
import com.chaining.spring.di.constructor.dao.UserDao;
import com.chaining.spring.di.constructor.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
}