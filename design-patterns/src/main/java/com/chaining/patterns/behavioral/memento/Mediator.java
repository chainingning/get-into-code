package com.chaining.patterns.behavioral.memento;

/**
 * <p>
 * 抽象中介者
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/24 10:19
 */
public abstract class Mediator {

    /**
     * 定义与同事间的交互通信
     * @param type
     */
    public abstract void common(String type);

}
