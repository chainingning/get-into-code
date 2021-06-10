package com.chaining.patterns.behavioral.chain;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/10 10:25
 */
public class ConcreteHandlerB extends AbstractHandler{

    @Override
    public void handleRequest(String condition) {
        if (condition.equals("B")) {
            System.out.println("ConcreteHandlerB处理");
        } else {
            System.out.println("ConcreteHandlerB不处理，由其他的Handler处理");
            super.getHandler().handleRequest(condition);
        }
    }
}
