package com.chaining.patterns.behavioral.visitor;

/**
 * <p>
 * 具体元素的实现对象
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/25 16:29
 */
public class ConcreteElementB extends Element{

    @Override
    public void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.visitConcreteElementB(this);
    }

    /**
     * 示例方法，表示元素已有的功能实现
     */
    public void operationB(){
        //已有的功能实现
        System.out.println("operationB");
    }
}
