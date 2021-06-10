package com.chaining.patterns.behavioral.chain;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/10 10:25
 */
public class ConcreteHandlerA extends AbstractHandler{

    @Override
    public void handleRequest(String condition) {
        if (condition.equals("A")) {
            System.out.println("ConcreteHandlerA处理");
        } else {
            System.out.println("ConcreteHandlerA不处理，由其他的Handler处理");
            super.getHandler().handleRequest(condition);
        }
    }
}
