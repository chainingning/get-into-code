package com.chaining.patterns.structural.bridge;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/08 13:51
 */
public class ConcreteImplementorA implements Implementor{

    @Override
    public void operation() {
        System.out.println("implementA");
    }
}
