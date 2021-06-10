package com.chaining.patterns.behavioral.chain;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/10 10:22
 */
public abstract class AbstractHandler {

    private AbstractHandler handler;

    public abstract void handleRequest(String condition);


    public AbstractHandler getHandler() {
        return handler;
    }

    public void setHandler(AbstractHandler handler) {
        this.handler = handler;
    }
}
