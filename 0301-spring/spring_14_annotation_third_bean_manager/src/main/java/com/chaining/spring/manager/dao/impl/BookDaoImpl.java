package com.chaining.spring.manager.dao.impl;

import com.chaining.spring.manager.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }
}