package com.chaining.patterns.behavioral.visitor;

/**
 * <p>
 * 被访问的元素的接口
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/25 16:24
 */
public abstract class Element {
    /**
     * 接受访问者的访问
     * @param visitor 访问者对象
     */
    public abstract void accept(Visitor visitor);
}
