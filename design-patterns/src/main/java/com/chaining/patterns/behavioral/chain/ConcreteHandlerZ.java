package com.chaining.patterns.behavioral.chain;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/10 10:25
 */
public class ConcreteHandlerZ extends AbstractHandler{

    @Override
    public void handleRequest(String condition) {
        //一般是最后一个处理者
        System.out.println("ConcreteHandlerZ处理");
    }
}
