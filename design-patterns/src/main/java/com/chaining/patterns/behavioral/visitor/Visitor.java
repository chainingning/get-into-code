package com.chaining.patterns.behavioral.visitor;

/**
 * <p>
 * 访问者接口
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/25 16:25
 */
public interface Visitor {
    void visitConcreteElementA(ConcreteElementA elementA);
    void visitConcreteElementB(ConcreteElementB elementB);
}
