package com.chaining.patterns.behavioral.visitor;

/**
 * <p>
 * 具体的访问者实现
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/25 16:38
 */
public class ConcreteVisitor1 implements Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA element) {
        //把要访问ConcreteElementA时，需要执行的功能实现在这里
        //可能需要访问元素的已有功能，比如：
        element.operationA();
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB element) {
        //把要访问ConcreteElementA时，需要执行的功能实现在这里
        //可能需要访问元素的已有功能，比如：
        element.operationB();
    }
}
