package com.chaining.base.api.date;

import org.junit.Test;

import java.util.Date;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class DateTest {

    @Test
    public void dateDemo01() {
        //public Date()：分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
        Date d1 = new Date();
        System.out.println(d1);

        //public Date(long date)：分配一个 Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
        long date = 1000 * 60 * 60;
        Date d2 = new Date(date);
        System.out.println(d2);
    }

}
