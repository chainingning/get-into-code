package com.chaining.httpserver.factory;

import com.chaining.httpserver.dao.StudentDao;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class StudentDaoFactory {

    public static StudentDao getStudentDao(){
        return new StudentDao();
    }

}
