package com.chaining.spring.mybatis;

import com.chaining.spring.mybatis.config.SpringConfig;
import com.chaining.spring.mybatis.domain.Account;
import com.chaining.spring.mybatis.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = ctx.getBean(AccountService.class);

        Account ac = accountService.findById(2);
        System.out.println(ac);
    }
}