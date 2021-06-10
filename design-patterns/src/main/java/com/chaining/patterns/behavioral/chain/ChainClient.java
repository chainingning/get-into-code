package com.chaining.patterns.behavioral.chain;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/10 10:31
 */
public class ChainClient {
    public static void main(String[] args) {
        AbstractHandler handlerA = new ConcreteHandlerA();
        AbstractHandler handlerB = new ConcreteHandlerB();
        AbstractHandler handlerZ = new ConcreteHandlerZ();
        // 如A处理不掉转交给B
        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerZ);
        handlerA.handleRequest("Z");
    }
}
