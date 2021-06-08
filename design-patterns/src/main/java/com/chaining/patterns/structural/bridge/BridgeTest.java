package com.chaining.patterns.structural.bridge;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/06/08 14:22
 */
public class BridgeTest {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();

        //调用第一个实现类
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        //调用第二个实现类
        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
