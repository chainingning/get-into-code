package com.chaining.patterns.creational.factoryMethod;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/05/31 15:22
 */
public class FactoryPattern {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.Manufacture().Show();

        FactoryB factoryB = new FactoryB();
        factoryB.Manufacture().Show();
    }
}
