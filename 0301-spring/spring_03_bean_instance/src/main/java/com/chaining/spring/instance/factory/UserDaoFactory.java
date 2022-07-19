package com.chaining.spring.instance.factory;

import com.chaining.spring.instance.dao.UserDao;
import com.chaining.spring.instance.dao.impl.UserDaoImpl;

//实例工厂创建对象
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}