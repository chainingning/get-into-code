package com.chaining.ssm.quickstart.dao.impl;

import com.chaining.ssm.quickstart.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }
}