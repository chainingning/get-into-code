package com.chaining.spring.instance.dao.impl;

import com.chaining.spring.instance.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {

    public void save() {
        System.out.println("order dao save ...");
    }
}