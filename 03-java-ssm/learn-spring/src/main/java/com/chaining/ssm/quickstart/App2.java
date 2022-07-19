package com.chaining.ssm.quickstart;

import com.chaining.ssm.quickstart.dao.BookDao;
import com.chaining.ssm.quickstart.service.BookService;
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

        BookService bookService = (BookService) ctx.getBean("bookServiceBean");
        bookService.save();


    }

}
