package com.chaining.spring.annotation.service.impl;

import com.chaining.spring.annotation.dao.BookDao;
import com.chaining.spring.annotation.service.BookService;
import org.springframework.stereotype.Service;

//@Component定义bean
//@Component
//@Service：@Component衍生注解
@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}