package com.chaining.spring.config.dao.impl;

import com.chaining.spring.config.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }
}