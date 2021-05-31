package com.chaining.patterns.creational.simple;

/**
 * <p>
 * 测试类
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/05/31 14:49
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = ShapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = ShapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = ShapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
