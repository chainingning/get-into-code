package com.chaining.patterns.behavioral.visitor;

/**
 * <p>
 * 具体元素的实现对象
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/25 16:28
 */
public class ConcreteElementA extends Element{

    @Override
    public void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.visitConcreteElementA(this);
    }

    /**
     * 示例方法，表示元素已有的功能实现
     */
    public void operationA(){
        //已有的功能实现
        System.out.println("operationA");
    }
}
