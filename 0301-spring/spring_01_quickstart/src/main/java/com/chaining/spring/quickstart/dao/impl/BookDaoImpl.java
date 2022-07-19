package com.chaining.spring.quickstart.dao.impl;

import com.chaining.spring.quickstart.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }
}