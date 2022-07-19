package com.chaining.spring.lifecycle.dao.impl;


import com.chaining.spring.lifecycle.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }

    private void init() {
        System.out.println("book dao init");
    }

    private void destroy() {
        System.out.println("book dao destroy");
    }
}