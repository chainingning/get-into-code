package com.chaining.ssm.quickstart;

import com.chaining.ssm.quickstart.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class App2 {

    public static void main(String[] args) {
        //获取IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

    }

}
