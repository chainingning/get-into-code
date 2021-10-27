package com.chaining.patterns.behavioral.visitor;

/**
 * <p>
 * 访问者接口
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/25 16:25
 */
public interface Visitor {
    /**
     * 访问元素A，相当于给元素A添加访问者的功能
     * @param elementA 元素A的对象
     */
    void visitConcreteElementA(ConcreteElementA elementA);
    /**
     * 访问元素B，相当于给元素B添加访问者的功能
     * @param elementB 元素B的对象
     */
    void visitConcreteElementB(ConcreteElementB elementB);
}
