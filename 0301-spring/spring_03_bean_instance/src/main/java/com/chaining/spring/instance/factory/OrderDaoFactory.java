package com.chaining.spring.instance.factory;

import com.chaining.spring.instance.dao.OrderDao;
import com.chaining.spring.instance.dao.impl.OrderDaoImpl;

/**
 * <p>
 * 静态工厂创建对象
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class OrderDaoFactory {
    public static OrderDao getOrder(){
        System.out.println("factory setup...");
        return new OrderDaoImpl();
    }

}
