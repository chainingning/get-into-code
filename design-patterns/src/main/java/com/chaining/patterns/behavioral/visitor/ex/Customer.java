package com.chaining.patterns.behavioral.visitor.ex;

/**
 * <p>
 * 各种客户的父类
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/10/27 17:14
 */
public abstract class Customer {

    /**
     * 客户编号
     */
    private String customerId;

    /**
     * 客户名称
     */
    private String name;

    /**
     * 客户提出服务请求的方法，示意一下
     */
    public abstract void serviceRequest();
}
