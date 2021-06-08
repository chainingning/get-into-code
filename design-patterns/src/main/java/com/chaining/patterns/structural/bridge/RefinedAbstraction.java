package com.chaining.patterns.structural.bridge;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/08 14:19
 */
public class RefinedAbstraction extends Abstraction{


    @Override
    protected void operation() {
        super.getImplementor().operation();
    }

}
