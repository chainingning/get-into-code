package com.chaining.base.api.date.JDK8Date;

import org.junit.Test;

import java.time.LocalDateTime;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class JDK8DateTest {


    @Test
    public  void JDK8DateDemo() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime localDateTime = LocalDateTime.of(2022, 11, 11, 11, 11, 11);
        System.out.println(localDateTime);
    }


    public void JDK8DateDemo2() {
    }




}
