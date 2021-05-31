package com.chaining.patterns.creational.simple;

/**
 * <p>
 * 具体产品角色1
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/05/31 14:46
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
