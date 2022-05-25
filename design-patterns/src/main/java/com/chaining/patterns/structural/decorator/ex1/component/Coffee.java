package com.chaining.patterns.structural.decorator.ex1.component;

import com.chaining.patterns.structural.decorator.ex1.component.Drink;

/**
 * 问题：为什么这里还要做一个coffee的类呢？
 */
public class Coffee extends Drink {
    /**
     * 计算费用的抽象方法
     * 子类来实现
     */
    @Override
    public float cost() {
        return super.getPrice();
    }
}
