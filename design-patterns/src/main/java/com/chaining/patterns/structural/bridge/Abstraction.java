package com.chaining.patterns.structural.bridge;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/08 13:55
 */
public abstract class Abstraction {

    private Implementor implementor;

    protected void operation(){
        this.implementor.operation();
    }

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

}
