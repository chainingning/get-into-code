package com.chaining.spring.instance.dao.impl;

import com.chaining.spring.instance.dao.UserDao;

public class UserDaoImpl implements UserDao {

    public void save() {
        System.out.println("user dao save ...");
    }
}