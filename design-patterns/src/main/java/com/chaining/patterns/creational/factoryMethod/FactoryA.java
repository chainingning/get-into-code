package com.chaining.patterns.creational.factoryMethod;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/05/31 15:21
 */
public class FactoryA extends Factory{

    @Override
    public Product Manufacture() {
        return new ProductA();
    }
}
