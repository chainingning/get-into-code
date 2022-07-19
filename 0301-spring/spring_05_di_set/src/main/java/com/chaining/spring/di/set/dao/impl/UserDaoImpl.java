package com.chaining.spring.di.set.dao.impl;

import com.chaining.spring.di.set.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("user dao save ...");
    }
}