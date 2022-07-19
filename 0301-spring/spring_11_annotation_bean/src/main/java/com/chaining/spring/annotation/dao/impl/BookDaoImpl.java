package com.chaining.spring.annotation.dao.impl;

import com.chaining.spring.annotation.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
//@Component定义bean
//@Component("bookDao")
//@Repository：@Component衍生注解
@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("bookDao save");
    }
}
