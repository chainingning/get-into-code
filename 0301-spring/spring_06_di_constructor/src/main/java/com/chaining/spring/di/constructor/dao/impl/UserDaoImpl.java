package com.chaining.spring.di.constructor.dao.impl;

import com.chaining.spring.di.constructor.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("user dao save ...");
    }
}